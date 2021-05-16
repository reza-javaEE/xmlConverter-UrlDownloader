package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usps implements Serializable {

    public HotelAttributes hotelAttributes;

    public Usps() {
    }

    public Usps(HotelAttributes hotelAttributes) {
        this.hotelAttributes = hotelAttributes;
    }

    public HotelAttributes getHotelAttributes() {
        return hotelAttributes;
    }

    public void setHotelAttributes(HotelAttributes hotelAttributes) {
        this.hotelAttributes = hotelAttributes;
    }

    @Override
    public String toString() {
        return "Usps{" +
                "hotelAttributes=" + hotelAttributes +
                '}';
    }
}
