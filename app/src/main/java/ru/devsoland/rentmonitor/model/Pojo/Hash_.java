
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hash_ {

    @SerializedName("hash")
    @Expose
    private Object hash;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("nice")
    @Expose
    private String nice;

    public Object getHash() {
        return hash;
    }

    public void setHash(Object hash) {
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
