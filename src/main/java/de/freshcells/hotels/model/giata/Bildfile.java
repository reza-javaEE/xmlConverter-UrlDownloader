package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bildfile implements Serializable {

    public String typ;
    public int seq;
    public int size;
    public int width;
    public int height;
    public String id;
    public String text;

    public Bildfile() {
    }

    public Bildfile(String typ, int seq, int size, int width, int height, String id, String text) {
        this.typ = typ;
        this.seq = seq;
        this.size = size;
        this.width = width;
        this.height = height;
        this.id = id;
        this.text = text;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Bildfile{" +
                "typ='" + typ + '\'' +
                ", seq=" + seq +
                ", size=" + size +
                ", width=" + width +
                ", height=" + height +
                ", id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
