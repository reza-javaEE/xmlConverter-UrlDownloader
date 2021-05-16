package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Urls implements Serializable {

    public List<Url> urls;

    public Urls() {
    }

    public Urls(List<Url> urls) {
        this.urls = urls;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "Urls{" +
                "urls=" + urls +
                '}';
    }
}
