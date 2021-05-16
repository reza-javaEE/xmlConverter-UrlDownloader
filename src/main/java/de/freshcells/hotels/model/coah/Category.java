package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable {

    public List<String> attribute;
    public String name;
    public String text;

    public Category(List<String> attribute, String name, String text) {
        this.attribute = attribute;
        this.name = name;
        this.text = text;
    }

    public Category() {
    }

    public List<String> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<String> attribute) {
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Category{" +
                "attribute=" + attribute +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
