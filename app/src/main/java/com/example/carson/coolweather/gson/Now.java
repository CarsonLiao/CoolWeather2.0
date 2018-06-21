package com.example.carson.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }



}
