package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 00000 on 2018/1/7.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
