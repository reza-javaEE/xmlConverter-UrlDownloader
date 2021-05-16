package de.freshcells.hotels.service;


import de.freshcells.hotels.config.Utility;
import de.freshcells.hotels.model.Output;
import de.freshcells.hotels.model.coah.Hotel;
import de.freshcells.hotels.model.coah.Image;
import de.freshcells.hotels.model.giata.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * A converter, that creates one json document out of different XML & Json files.
 * All contents of the xml files will be included in the one json file, but there is no duplicates.
 * Download Images that are referenced inside the files (only images)
 */

@Service
public class ConverterService {

    private static final Logger logger = LoggerFactory.getLogger(ConverterService.class);
    private final HotelCache hotelCache;
    private final Utility utility;

    public ConverterService(HotelCache hotelCache, Utility utility) {
        this.hotelCache = hotelCache;
        this.utility = utility;
    }

    /**
     * this synchronized block helps that every time only one thread work on it, so it helps cache works correctly,
     * because two thread can't read or write synchronously so there is no synchronization issue.
     *
     * @throws IOException
     */
    public void convert() throws IOException {

        List<Output> outputs = new ArrayList<>();
        Output output;

        List<Hotel> hotels = getHotelFromFiles();
        List<Data> giataList = getHotelDetails();

        for (Hotel hotel : hotels) {

            for (Data giata : giataList) {
                if (giata.getGeoData().GiataID == hotel.getGiataId()) {

                    synchronized (this) {
                        if (!hotelCache.exist(hotel)) {
                            output = new Output(hotel, giata);
                            outputs.add(output);
                            hotelCache.add(hotel);
                        }
                    }
                }
            }
        }
        createOutputFile(outputs);
        downloadImages(outputs);
    }

    /**
     * convert a list of output to json
     * write output string in a file
     *
     * @param outputs
     */
    private void createOutputFile(List<Output> outputs) {

        Thread convertThread = new Thread(() -> {
            try {
                utility.convertListToJson(outputs);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        convertThread.start();
        try {
            convertThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * list all files which contain("coah")
     * no matter file is xml or json
     * fetch hotel inside them
     * add them to list and return list
     * get all files that contain(coah)
     * search read filer in thread
     *
     * @return List<Hotel> . it is a list of coah files.
     * @throws IOException
     */
    private List<Hotel> getHotelFromFiles() throws IOException {
        return utility.loadCoahFiles();
    }

    /**
     * load all file that its name contains giataId
     * convert xml element to giata json
     *
     * @param
     * @return List<Data> . it is a list of Giata files
     * @throws IOException
     */
    private List<Data> getHotelDetails() throws IOException {
        return utility.loadGiataFiles();
    }

    /**
     * get a list of urls and download the hotel images
     *
     * @param outputs
     */
    private void downloadImages(List<Output> outputs) {
        ExecutorService executor = Executors.newFixedThreadPool(30);
        int i = 0;
        logger.info(" downloadImages start : " + LocalDateTime.now());
        for (Output o : outputs) {
            for (Image image : o.getHotel().getImages().getImage()) {
                i++;
                executor.submit(new ImageDownloaderApp(image.getUrl(), i));
            }
        }
        executor.shutdown();
        logger.info("All downloads submitted.");
        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("All downloads completed : " + LocalDateTime.now());
    }
}
