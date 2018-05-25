
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prices {

    @SerializedName("lowest")
    @Expose
    private Lowest lowest;
    @SerializedName("last_10")
    @Expose
    private Last10 last10;
    @SerializedName("last")
    @Expose
    private Last last;

    public Lowest getLowest() {
        return lowest;
    }

    public void setLowest(Lowest lowest) {
        this.lowest = lowest;
    }

    public Last10 getLast10() {
        return last10;
    }

    public void setLast10(Last10 last10) {
        this.last10 = last10;
    }

    public Last getLast() {
        return last;
    }

    public void setLast(Last last) {
        this.last = last;
    }

}
