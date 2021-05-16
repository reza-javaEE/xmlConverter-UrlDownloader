package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationRating implements Serializable {

    public double overall;
    public double single;
    public double couple;
    public double family;
    public double friends;
    public double beach;
    public double wintersport;
    public double other;

    public LocationRating() {
    }

    public LocationRating(double overall, double single, double couple, double family, double friends, double beach, double wintersport, double other) {
        this.overall = overall;
        this.single = single;
        this.couple = couple;
        this.family = family;
        this.friends = friends;
        this.beach = beach;
        this.wintersport = wintersport;
        this.other = other;
    }

    public double getOverall() {
        return overall;
    }

    public void setOverall(double overall) {
        this.overall = overall;
    }

    public double getSingle() {
        return single;
    }

    public void setSingle(double single) {
        this.single = single;
    }

    public double getCouple() {
        return couple;
    }

    public void setCouple(double couple) {
        this.couple = couple;
    }

    public double getFamily() {
        return family;
    }

    public void setFamily(double family) {
        this.family = family;
    }

    public double getFriends() {
        return friends;
    }

    public void setFriends(double friends) {
        this.friends = friends;
    }

    public double getBeach() {
        return beach;
    }

    public void setBeach(double beach) {
        this.beach = beach;
    }

    public double getWintersport() {
        return wintersport;
    }

    public void setWintersport(double wintersport) {
        this.wintersport = wintersport;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "LocationRating{" +
                "overall=" + overall +
                ", single=" + single +
                ", couple=" + couple +
                ", family=" + family +
                ", friends=" + friends +
                ", beach=" + beach +
                ", wintersport=" + wintersport +
                ", other=" + other +
                '}';
    }

}
