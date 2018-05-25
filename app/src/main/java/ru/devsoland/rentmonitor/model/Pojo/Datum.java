
package ru.devsoland.rentmonitor.model.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("display")
    @Expose
    private String display;
    @SerializedName("suggested_price")
    @Expose
    private SuggestedPrice suggestedPrice;
    @SerializedName("stats")
    @Expose
    private Stats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public SuggestedPrice getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(SuggestedPrice suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
