
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("available")
    @Expose
    private Available available;
    @SerializedName("rented")
    @Expose
    private Rented rented;
    @SerializedName("prices")
    @Expose
    private Prices prices;

    public Available getAvailable() {
        return available;
    }

    public void setAvailable(Available available) {
        this.available = available;
    }

    public Rented getRented() {
        return rented;
    }

    public void setRented(Rented rented) {
        this.rented = rented;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

}
