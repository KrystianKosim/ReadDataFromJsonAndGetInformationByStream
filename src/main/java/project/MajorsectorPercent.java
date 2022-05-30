package project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MajorsectorPercent {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Percent")
    public int percent;
}