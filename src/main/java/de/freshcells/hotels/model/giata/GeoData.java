package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoData implements Serializable {

    public int GiataID;
    public double Latitude;
    public double Longitude;
    public int Accuracy;
}
