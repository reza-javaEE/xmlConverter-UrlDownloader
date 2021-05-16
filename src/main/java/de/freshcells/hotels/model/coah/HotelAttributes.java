package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelAttributes implements Serializable {

    public Attribute attribute;
    public String source;
    public String text;

    public HotelAttributes() {
    }

    public HotelAttributes(Attribute attribute, String source, String text) {
        this.attribute = attribute;
        this.source = source;
        this.text = text;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HotelAttributes{" +
                "attribute=" + attribute +
                ", source='" + source + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
