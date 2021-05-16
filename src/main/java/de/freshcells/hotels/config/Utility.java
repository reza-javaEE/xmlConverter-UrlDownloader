package de.freshcells.hotels.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import de.freshcells.hotels.model.Output;
import de.freshcells.hotels.model.coah.Content;
import de.freshcells.hotels.model.coah.Hotel;
import de.freshcells.hotels.model.giata.Data;
import de.freshcells.hotels.model.giata.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Use Dashboard class to load files
 * Serialize and Deserialize objects - XML - Json
 */
@Component
public class Utility {

    Hotel hotel;
    Data data;

    @Value("${input.path}")
    private String INPUT_PATH;
    @Value("${output.path.json}")
    private String OUTPUT_PATH;


    /**
     * Read the file into an input stream, Manage that file is xml or json, and then convert the input stream
     * to a String with a simple utility method. Convert xml element to java object
     *
     * @return List<Hotel> . it is a list of coah files.
     */

    public List<Hotel> loadCoahFiles() {


        final File xmlFolder = new File(INPUT_PATH);
        List<Hotel> hotelList = new ArrayList<>();

        for (File fileEntry : Objects.requireNonNull(xmlFolder.listFiles())) {
            try {
                if (fileEntry.getName().contains("coah")) {
                    if (Files.probeContentType(fileEntry.toPath()).equals("text/xml")) {
                        hotel = convertXMLToHotelObject(fileEntry);
                        if (hotel != null)
                            hotelList.add(hotel);
                    } else if (Files.probeContentType(fileEntry.toPath()).equals("application/json")) {
                        hotel = convertJsonToHotelObject(fileEntry);
                        if (hotel != null)
                            hotelList.add(hotel);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return hotelList;
    }

    public List<Data> loadGiataFiles() {

        final File xmlFolder = new File(INPUT_PATH);

        List<Data> dataList = new ArrayList<>();
        for (File fileEntry : Objects.requireNonNull(xmlFolder.listFiles())) {
            try {
                if (fileEntry.getName().contains("giata")) {
                    if (Files.probeContentType(fileEntry.toPath()).equals("text/xml")) {
                        data = convertXMLToDataObject(fileEntry);
                        if (data != null)
                            dataList.add(data);
                    } else if (Files.probeContentType(fileEntry.toPath()).equals("application/json")) {
                        data = convertJsonToDataObject(fileEntry);
                        if (data != null)
                            dataList.add(data);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dataList;
    }

    /**
     * deserialize XML to Hotel class
     *
     * @param coahFile . it is a coah xml file
     * @return content.getHotel() . it is a result of deserialization xml to hotel object.
     * @throws IOException
     */
    public Hotel convertXMLToHotelObject(File coahFile) throws IOException {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String xml = convertInputStreamToString(new FileInputStream(coahFile));
        Content content = xmlMapper.readValue(xml, Content.class);
        return content.getHotel();


    }

    /**
     * convert the input stream to a String
     *
     * @param is
     * @return string
     * @throws IOException
     */
    public String convertInputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    /**
     * deserialize XML to Data class
     *
     * @param giataFile
     * @return Data object
     * @throws IOException
     */
    public Data convertXMLToDataObject(File giataFile) throws IOException {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        String xml = convertInputStreamToString(new FileInputStream(giataFile));
        Result result = xmlMapper.readValue(xml, Result.class);
        return result.data;

    }

    /**
     * deserialize Json to Hotel class
     *
     * @param jsonFile
     * @return Hotel object
     * @throws IOException
     */
    public Hotel convertJsonToHotelObject(File jsonFile) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Content content = objectMapper.readValue(jsonFile, Content.class);
        return content.getHotel();
    }

    /**
     * deserialize Json to Data class
     *
     * @param jsonFile
     * @return Data object
     * @throws IOException
     */
    public Data convertJsonToDataObject(File jsonFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        data = objectMapper.readValue(jsonFile, Data.class);
        return data;
    }

    /**
     * Serialize list of objects to JSON using jackson
     *
     * @param hotelList
     * @throws IOException
     */
    public void convertListToJson(List<Output> hotelList) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(OUTPUT_PATH), hotelList);
    }

}
