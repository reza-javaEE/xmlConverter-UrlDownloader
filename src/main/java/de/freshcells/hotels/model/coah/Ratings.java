package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ratings implements Serializable {

    public int hcId;
    public double recommendationRate;
    public double rating;
    public int reviews;
    public String url;
    public DetailedRating detailedRating;
    public String source;
    public String text;

    public Ratings() {
    }

    public Ratings(int hcId, double recommendationRate, double rating, int reviews, String url, DetailedRating detailedRating, String source, String text) {
        this.hcId = hcId;
        this.recommendationRate = recommendationRate;
        this.rating = rating;
        this.reviews = reviews;
        this.url = url;
        this.detailedRating = detailedRating;
        this.source = source;
        this.text = text;
    }

    public int getHcId() {
        return hcId;
    }

    public void setHcId(int hcId) {
        this.hcId = hcId;
    }

    public double getRecommendationRate() {
        return recommendationRate;
    }

    public void setRecommendationRate(double recommendationRate) {
        this.recommendationRate = recommendationRate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DetailedRating getDetailedRating() {
        return detailedRating;
    }

    public void setDetailedRating(DetailedRating detailedRating) {
        this.detailedRating = detailedRating;
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
        return "Ratings{" +
                "hcId=" + hcId +
                ", recommendationRate=" + recommendationRate +
                ", rating=" + rating +
                ", reviews=" + reviews +
                ", url='" + url + '\'' +
                ", detailedRating=" + detailedRating +
                ", source='" + source + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
