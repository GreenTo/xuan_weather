package com.xuanweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("text")
        public String info;

    }
}
