package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paragraph implements Serializable {

    public String headline;
    public Object description;
    public String text;

    public Paragraph() {
    }

    public Paragraph(String headline, Object description, String text) {
        this.headline = headline;
        this.description = description;
        this.text = text;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "headline='" + headline + '\'' +
                ", description=" + description +
                ", text='" + text + '\'' +
                '}';
    }
}
