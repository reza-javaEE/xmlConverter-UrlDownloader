package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable {
    public int priority;
    public double rating;
    public String text;

    public Attribute(int priority, double rating, String text) {
        this.priority = priority;
        this.rating = rating;
        this.text = text;
    }

    public Attribute() {
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "priority=" + priority +
                ", rating=" + rating +
                ", text='" + text + '\'' +
                '}';
    }

}
