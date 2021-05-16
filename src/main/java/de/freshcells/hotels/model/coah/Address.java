package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {

    public int zip;
    public String city;
    public String country;
    public Formatted formatted;

    public Address() {
    }

    public Address(int zip, String city, String country, Formatted formatted) {
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.formatted = formatted;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Formatted getFormatted() {
        return formatted;
    }

    public void setFormatted(Formatted formatted) {
        this.formatted = formatted;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zip=" + zip +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", formatted=" + formatted +
                '}';
    }
}
