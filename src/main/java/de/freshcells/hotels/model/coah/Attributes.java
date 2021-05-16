package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes implements Serializable {

    public List<Category> category;
    public String source;
    public String text;

    public Attributes(List<Category> category, String source, String text) {
        this.category = category;
        this.source = source;
        this.text = text;
    }

    public Attributes() {
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
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
        return "Attributes{" +
                "category=" + category +
                ", source='" + source + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
