package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DayTemperature {
    public int Month1;
    public int Month2;
    public int Month3;
    public int Month4;
    public int Month5;
    public int Month6;
    public int Month7;
    public int Month8;
    public int Month9;
    public int Month10;
    public int Month11;
    public int Month12;
}
