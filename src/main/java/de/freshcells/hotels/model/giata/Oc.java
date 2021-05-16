package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Oc {
    public int Seq;
    public String Text;
}
