package de.freshcells.hotels.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/**
 * It can connect the image path and download the images bytes.
 * <p>
 * URL represents a pointer to an image on the internet.
 * just read the image bytes and write it using FileOutputStream.
 */
public class ImageDownloaderApp implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ConverterService.class);
    String imageUrl;
    int imageName;

    public ImageDownloaderApp(String imageUrl, int imageName) {
        this.imageUrl = imageUrl;
        this.imageName = imageName;
    }

    @Override
    public void run() {

        InputStream inputStream = null;
        OutputStream outputStream = null;

        logger.info("Downloading image" + imageName + " ... " + imageUrl);

        try {
            URL url = new URL(imageUrl);
            inputStream = url.openStream();
            outputStream = new FileOutputStream("d:\\files\\pics\\" + imageName + ".jpg");

            byte[] buffer = new byte[2048];
            int length;

            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

        } catch (MalformedURLException e) {
            logger.error("MalformedURLException :- " + e.getMessage());

        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException :- " + e.getMessage());

        } catch (IOException e) {
            logger.error("IOException :- " + e.getMessage());

        } finally {
            try {

                Objects.requireNonNull(inputStream).close();
                Objects.requireNonNull(outputStream).close();

            } catch (IOException e) {
                logger.error("Finally IOException :- " + e.getMessage());
            }
        }
    }

}