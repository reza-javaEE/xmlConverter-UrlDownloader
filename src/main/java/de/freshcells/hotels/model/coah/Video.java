package de.freshcells.hotels.model.coah;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video implements Serializable {

    public Urls urls;
    public String source;
    public int priority;
    public boolean hasPlayer;
    public String text;

    public Video() {
    }

    public Video(Urls urls, String source, int priority, boolean hasPlayer, String text) {
        this.urls = urls;
        this.source = source;
        this.priority = priority;
        this.hasPlayer = hasPlayer;
        this.text = text;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isHasPlayer() {
        return hasPlayer;
    }

    public void setHasPlayer(boolean hasPlayer) {
        this.hasPlayer = hasPlayer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Video{" +
                "urls=" + urls +
                ", source='" + source + '\'' +
                ", priority=" + priority +
                ", hasPlayer=" + hasPlayer +
                ", text='" + text + '\'' +
                '}';
    }
}
