package com.develogical;

import com.weather.Day;
import com.weather.Forecast;
import com.weather.Forecaster;
import com.weather.Region;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ape04 on 21/01/2016.
 */
public class ForecastService {

    public enum ForecastRegion {
        BIRMINGHAM,
        EDINBURGH,
        GLASGOW,
        LONDON,
        MANCHESTER,
        NORTH_ENGLAND,
        SOUTH_WEST_ENGLAND,
        SOUTH_EAST_ENGLAND,
        WALES;

        private ForecastRegion() {
        }
    }

    public enum ForecastDay {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        private ForecastDay() {
        }
    }

    private static ForecastService instance = null;

    private ArrayList<ForecastServiceCache> cache = new ArrayList<>();

    public static ForecastService getInstance() {
        if (instance == null) {
            instance = new ForecastService();
        }

        return  instance;
    }

    public ForecastMetadata loadForecastMetadata(ForecastRegion fregion, ForecastDay fday) {

        Forecaster forecaster = new Forecaster();
        Region region = null;
        Day day = null;

        // TODO: complete

        switch (fregion) {
            case LONDON: region = Region.LONDON;
                break;
            default:
                break;
        }

        switch (fday) {
            case MONDAY: day = Region.MONDAY;
                break;
            default:
                break;
        }

        // check cache
        ForecastServiceCache foundCache = null;
        for (ForecastServiceCache serviceCache : this.cache) {
            if serviceCache.key
        }

        Forecast londonForecast = forecaster.forecastFor(region, day);

    }

    // cache

    private class ForecastServiceCache {

        private Date cachedDate;
        protected ForecastMetadata cachedObject;
        protected String key = "";

        private long MAX_DURATION = 3600000; // milliseconds

        ForecastServiceCache(ForecastMetadata cachedObject, String key) {
            this.cachedObject = cachedObject;
            this.cachedDate = new Date();
            this.key = key;
        }

        protected Boolean isExpired() {
           return (new Date()).getTime() - this.cachedDate.getTime() > MAX_DURATION;
        }
    }
}
