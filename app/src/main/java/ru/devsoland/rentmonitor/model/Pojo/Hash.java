
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hash {

    @SerializedName("hash")
    @Expose
    private double hash;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("nice")
    @Expose
    private String nice;

    public double getHash() {
        return hash;
    }

    public void setHash(double hash) {
        this.hash = hash;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNice() {
        return nice;
    }

    public void setNice(String nice) {
        this.nice = nice;
    }

}
