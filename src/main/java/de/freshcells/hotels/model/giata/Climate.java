package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Climate implements Serializable {

    public DayTemperature dayTemperature;
    public NightTemperature nightTemperature;
    public Sunshine sunshine;
    public Rainday rainday;
    public WaterTemperature waterTemperature;
    public String kind;
    public int id;
    public double text;

    public Climate() {
    }

    public Climate(DayTemperature dayTemperature, NightTemperature nightTemperature, Sunshine sunshine, Rainday rainday, WaterTemperature waterTemperature, String kind, int id, double text) {
        this.dayTemperature = dayTemperature;
        this.nightTemperature = nightTemperature;
        this.sunshine = sunshine;
        this.rainday = rainday;
        this.waterTemperature = waterTemperature;
        this.kind = kind;
        this.id = id;
        this.text = text;
    }

    public DayTemperature getDayTemperature() {
        return dayTemperature;
    }

    public void setDayTemperature(DayTemperature dayTemperature) {
        this.dayTemperature = dayTemperature;
    }

    public NightTemperature getNightTemperature() {
        return nightTemperature;
    }

    public void setNightTemperature(NightTemperature nightTemperature) {
        this.nightTemperature = nightTemperature;
    }

    public Sunshine getSunshine() {
        return sunshine;
    }

    public void setSunshine(Sunshine sunshine) {
        this.sunshine = sunshine;
    }

    public Rainday getRainday() {
        return rainday;
    }

    public void setRainday(Rainday rainday) {
        this.rainday = rainday;
    }

    public WaterTemperature getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(WaterTemperature waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getText() {
        return text;
    }

    public void setText(double text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Climate{" +
                "dayTemperature=" + dayTemperature +
                ", nightTemperature=" + nightTemperature +
                ", sunshine=" + sunshine +
                ", rainday=" + rainday +
                ", waterTemperature=" + waterTemperature +
                ", kind='" + kind + '\'' +
                ", id=" + id +
                ", text=" + text +
                '}';
    }
}
