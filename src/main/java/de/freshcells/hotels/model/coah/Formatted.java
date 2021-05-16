package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Formatted implements Serializable {

    public List<String> line;

    public Formatted() {
    }

    public Formatted(List<String> line) {
        this.line = line;
    }

    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Formatted{" +
                "line=" + line +
                '}';
    }
}
