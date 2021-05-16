package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {
    @XmlElement
    public Data data;
    @XmlAttribute
    public int found;
    public String Text;

    public Result() {
    }

    public Result(Data data, int found, String text) {
        this.data = data;
        this.found = found;
        Text = text;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getFound() {
        return found;
    }

    public void setFound(int found) {
        this.found = found;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", found=" + found +
                ", Text='" + Text + '\'' +
                '}';
    }
}
