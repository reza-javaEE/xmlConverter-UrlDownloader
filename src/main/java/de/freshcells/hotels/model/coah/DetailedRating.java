package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedRating implements Serializable {

    public AverageRating averageRating;
    public HotelRating hotelRating;
    public LocationRating locationRating;
    public ServiceRating serviceRating;
    public FoodRating foodRating;
    public RoomRating roomRating;
    public SportRating sportRating;
    public Recommendation recommendation;

    public DetailedRating() {
    }

    public DetailedRating(AverageRating averageRating, HotelRating hotelRating, LocationRating locationRating, ServiceRating serviceRating, FoodRating foodRating, RoomRating roomRating, SportRating sportRating, Recommendation recommendation) {
        this.averageRating = averageRating;
        this.hotelRating = hotelRating;
        this.locationRating = locationRating;
        this.serviceRating = serviceRating;
        this.foodRating = foodRating;
        this.roomRating = roomRating;
        this.sportRating = sportRating;
        this.recommendation = recommendation;
    }

    public AverageRating getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(AverageRating averageRating) {
        this.averageRating = averageRating;
    }

    public HotelRating getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(HotelRating hotelRating) {
        this.hotelRating = hotelRating;
    }

    public LocationRating getLocationRating() {
        return locationRating;
    }

    public void setLocationRating(LocationRating locationRating) {
        this.locationRating = locationRating;
    }

    public ServiceRating getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(ServiceRating serviceRating) {
        this.serviceRating = serviceRating;
    }

    public FoodRating getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(FoodRating foodRating) {
        this.foodRating = foodRating;
    }

    public RoomRating getRoomRating() {
        return roomRating;
    }

    public void setRoomRating(RoomRating roomRating) {
        this.roomRating = roomRating;
    }

    public SportRating getSportRating() {
        return sportRating;
    }

    public void setSportRating(SportRating sportRating) {
        this.sportRating = sportRating;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return "DetailedRating{" +
                "averageRating=" + averageRating +
                ", hotelRating=" + hotelRating +
                ", locationRating=" + locationRating +
                ", serviceRating=" + serviceRating +
                ", foodRating=" + foodRating +
                ", roomRating=" + roomRating +
                ", sportRating=" + sportRating +
                ", recommendation=" + recommendation +
                '}';
    }
}
