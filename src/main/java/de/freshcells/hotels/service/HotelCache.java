package de.freshcells.hotels.service;

import de.freshcells.hotels.model.coah.Hotel;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Check Duplicate hotels and ignore it using HashMap,
 * Because hash map do not accept duplicate key.
 */
@Component
public class HotelCache {

    private final Map<String, Hotel> hotels = new HashMap<>();

    public Map<String, Hotel> getHotels() {
        return hotels;
    }

    public Boolean exist(final Hotel hotel) {
        return hotels.containsKey(hotel.getName());
    }

    public void add(final Hotel hotel) {
        hotels.put(hotel.getName(), hotel);
    }

}
