package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text {
    public String Lang;
    public String Text;
}
