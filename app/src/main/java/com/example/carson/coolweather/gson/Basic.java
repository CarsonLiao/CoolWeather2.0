package com.example.carson.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("City")
    public String cityName;

    @SerializedName("id")
    public String weatherName;

    public Update update;

    private class Update {
    @SerializedName("loc")
        public String updateTime;
    }
}
