package project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Theme1 {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Percent")
    public int percent;
}