package com.develogical;

import com.weather.Forecast;

/**
 * Created by ape04 on 21/01/2016.
 */
public class ForecastMetadata {

    private String summary = null;
    private int temperature = Integer.MIN_VALUE;

    public ForecastMetadata(String summary, int temperature) {
        this.summary = summary;
        this.temperature = temperature;
    }

    public String getSummary() {
        return this.summary;
    }

    public int getTemperature() {
        return this.temperature;
    }
}
