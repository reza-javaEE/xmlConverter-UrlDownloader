package de.freshcells.hotels.model.coah;


import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Content implements Serializable {

    private Hotel hotel;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Content{" +
                "hotel=" + hotel +
                '}';
    }
}
