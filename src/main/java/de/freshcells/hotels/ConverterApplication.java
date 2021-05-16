package de.freshcells.hotels;

import de.freshcells.hotels.service.ConverterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ConverterApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(ConverterApplication.class, args);
        ConverterService service = appContext.getBean(ConverterService.class);
        try {
            service.convert();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
