
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rented {

    @SerializedName("rigs")
    @Expose
    private String rigs;
    @SerializedName("hash")
    @Expose
    private Hash_ hash;

    public String getRigs() {
        return rigs;
    }

    public void setRigs(String rigs) {
        this.rigs = rigs;
    }

    public Hash_ getHash() {
        return hash;
    }

    public void setHash(Hash_ hash) {
        this.hash = hash;
    }

}
