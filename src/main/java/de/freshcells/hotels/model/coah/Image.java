package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image implements Serializable {

    public int priority;
    public Object title;
    public Object alt;
    public Object category;
    public int width;
    public int height;
    public String url;


    public Image() {

    }

    public Image(int priority, Object title, Object alt, Object category, int width, int height, String url) {
        this.priority = priority;
        this.title = title;
        this.alt = alt;
        this.category = category;
        this.width = width;
        this.height = height;
        this.url = url;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getAlt() {
        return alt;
    }

    public void setAlt(Object alt) {
        this.alt = alt;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "priority=" + priority +
                ", title=" + title +
                ", alt=" + alt +
                ", category=" + category +
                ", width=" + width +
                ", height=" + height +
                ", url='" + url + '\'' +
                '}';
    }
}
