package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text implements Serializable {

    public List<Paragraph> paragraphs;
    public String copyrightText;
    public String tourOperator;
    public String source;
    public Object tourOperatorLong;
    public Object id;
    public Object name;
    public String text;

    public Text() {
    }

    public Text(List<Paragraph> paragraphs, String copyrightText, String tourOperator, String source, Object tourOperatorLong, Object id, Object name, String text) {
        this.paragraphs = paragraphs;
        this.copyrightText = copyrightText;
        this.tourOperator = tourOperator;
        this.source = source;
        this.tourOperatorLong = tourOperatorLong;
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public String getCopyrightText() {
        return copyrightText;
    }

    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    public String getTourOperator() {
        return tourOperator;
    }

    public void setTourOperator(String tourOperator) {
        this.tourOperator = tourOperator;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getTourOperatorLong() {
        return tourOperatorLong;
    }

    public void setTourOperatorLong(Object tourOperatorLong) {
        this.tourOperatorLong = tourOperatorLong;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
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
        return "Text{" +
                "paragraphs=" + paragraphs +
                ", copyrightText='" + copyrightText + '\'' +
                ", tourOperator='" + tourOperator + '\'' +
                ", source='" + source + '\'' +
                ", tourOperatorLong=" + tourOperatorLong +
                ", id=" + id +
                ", name=" + name +
                ", text='" + text + '\'' +
                '}';
    }
}
