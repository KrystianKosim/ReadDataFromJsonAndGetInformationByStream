package project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Projectdoc {
    @JsonProperty("DocTypeDesc")
    public String docTypeDesc;
    @JsonProperty("DocType")
    public String docType;
    @JsonProperty("EntityID")
    public String entityID;
    @JsonProperty("DocURL")
    public String docURL;
    @JsonProperty("DocDate")
    public String docDate;
}
