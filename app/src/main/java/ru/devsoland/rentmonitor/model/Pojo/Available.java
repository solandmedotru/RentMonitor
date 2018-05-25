
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Available {

    @SerializedName("rigs")
    @Expose
    private String rigs;
    @SerializedName("hash")
    @Expose
    private Hash hash;

    public String getRigs() {
        return rigs;
    }

    public void setRigs(String rigs) {
        this.rigs = rigs;
    }

    public Hash getHash() {
        return hash;
    }

    public void setHash(Hash hash) {
        this.hash = hash;
    }

}
