package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 00000 on 2018/1/7.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
