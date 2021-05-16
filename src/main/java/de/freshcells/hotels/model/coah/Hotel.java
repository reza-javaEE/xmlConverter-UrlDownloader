package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel implements Serializable {

    @JsonProperty("giata_id")
    private int giataId;
    private int iff;
    private String name;
    private double Latitude;
    private double Longitude;
    private Address address;
    private double phone;
    private String Email;
    private String Url;
    private Date UpdateTimestamp;
    private Object Category;
    private Object RegionCode;
    private Object CountryName;
    private Texts Texts;
    private Usps Usps;
    private Object AdditionalTexts;
    private Images images;
    private Videos Videos;
    private Attributes Attributes;
    private Ratings Ratings;
    private Object HotelAwards;


    public Hotel() {
    }

    public int getGiataId() {
        return giataId;
    }

    public void setGiataId(int giataId) {
        this.giataId = giataId;
    }

    public int getIff() {
        return iff;
    }

    public void setIff(int iff) {
        this.iff = iff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Date getUpdateTimestamp() {
        return UpdateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        UpdateTimestamp = updateTimestamp;
    }

    public Object getCategory() {
        return Category;
    }

    public void setCategory(Object category) {
        Category = category;
    }

    public Object getRegionCode() {
        return RegionCode;
    }

    public void setRegionCode(Object regionCode) {
        RegionCode = regionCode;
    }

    public Object getCountryName() {
        return CountryName;
    }

    public void setCountryName(Object countryName) {
        CountryName = countryName;
    }

    public de.freshcells.hotels.model.coah.Texts getTexts() {
        return Texts;
    }

    public void setTexts(de.freshcells.hotels.model.coah.Texts texts) {
        Texts = texts;
    }

    public de.freshcells.hotels.model.coah.Usps getUsps() {
        return Usps;
    }

    public void setUsps(de.freshcells.hotels.model.coah.Usps usps) {
        Usps = usps;
    }

    public Object getAdditionalTexts() {
        return AdditionalTexts;
    }

    public void setAdditionalTexts(Object additionalTexts) {
        AdditionalTexts = additionalTexts;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public de.freshcells.hotels.model.coah.Videos getVideos() {
        return Videos;
    }

    public void setVideos(de.freshcells.hotels.model.coah.Videos videos) {
        Videos = videos;
    }

    public de.freshcells.hotels.model.coah.Attributes getAttributes() {
        return Attributes;
    }

    public void setAttributes(de.freshcells.hotels.model.coah.Attributes attributes) {
        Attributes = attributes;
    }

    public de.freshcells.hotels.model.coah.Ratings getRatings() {
        return Ratings;
    }

    public void setRatings(de.freshcells.hotels.model.coah.Ratings ratings) {
        Ratings = ratings;
    }

    public Object getHotelAwards() {
        return HotelAwards;
    }

    public void setHotelAwards(Object hotelAwards) {
        HotelAwards = hotelAwards;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "giataId=" + giataId +
                ", iff=" + iff +
                ", name='" + name + '\'' +
                ", Latitude=" + Latitude +
                ", Longitude=" + Longitude +
                ", address=" + address +
                ", phone=" + phone +
                ", Email='" + Email + '\'' +
                ", Url='" + Url + '\'' +
                ", UpdateTimestamp=" + UpdateTimestamp +
                ", Category=" + Category +
                ", RegionCode=" + RegionCode +
                ", CountryName=" + CountryName +
                ", Texts=" + Texts +
                ", Usps=" + Usps +
                ", AdditionalTexts=" + AdditionalTexts +
                ", images=" + images +
                ", Videos=" + Videos +
                ", Attributes=" + Attributes +
                ", Ratings=" + Ratings +
                ", HotelAwards=" + HotelAwards +
                '}';
    }
}
