package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images implements Serializable {
    @XmlElement
    public List<Image> image;
    @XmlAttribute
    public Object source;
    @XmlAttribute
    public Object sourceLong;
    @XmlAttribute
    public Object katalogid;
    @XmlAttribute
    public Object katalogname;
    @XmlAttribute
    public String text;

    public Images() {
    }

    public Images(List<Image> image, Object source, Object sourceLong, Object katalogid, Object katalogname, String text) {
        this.image = image;
        this.source = source;
        this.sourceLong = sourceLong;
        this.katalogid = katalogid;
        this.katalogname = katalogname;
        this.text = text;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getSourceLong() {
        return sourceLong;
    }

    public void setSourceLong(Object sourceLong) {
        this.sourceLong = sourceLong;
    }

    public Object getKatalogid() {
        return katalogid;
    }

    public void setKatalogid(Object katalogid) {
        this.katalogid = katalogid;
    }

    public Object getKatalogname() {
        return katalogname;
    }

    public void setKatalogname(Object katalogname) {
        this.katalogname = katalogname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Images{" +
                "image=" + image +
                ", source=" + source +
                ", sourceLong=" + sourceLong +
                ", katalogid=" + katalogid +
                ", katalogname=" + katalogname +
                ", text='" + text + '\'' +
                '}';
    }
}
