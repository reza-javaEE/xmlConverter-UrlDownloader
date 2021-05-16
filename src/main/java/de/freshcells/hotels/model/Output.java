package de.freshcells.hotels.model;

import de.freshcells.hotels.model.coah.Hotel;
import de.freshcells.hotels.model.giata.Data;

import java.io.Serializable;

public class Output implements Serializable {

    private Hotel hotel;
    private Data giata;

    public Output() {
    }

    public Output(Hotel hotel, Data giata) {
        this.hotel = hotel;
        this.giata = giata;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Data getGiata() {
        return giata;
    }

    public void setGiata(Data giata) {
        this.giata = giata;
    }

    @Override
    public String toString() {
        return "Output{" +
                "hotel=" + hotel +
                ", giata=" + giata +
                '}';
    }
}
