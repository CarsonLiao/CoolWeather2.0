package com.example.carson.coolweather.gson;

public class AQI {
    public AQICity city;


    private class AQICity {
        public String aqi;

        public String pm25;
    }
}
