package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class Android {

    @SerializedName("55c3389cb5ddd720dc0297617f3561c43a36218a277c974c8d43d545a643f45c")
    private String androidpush;

    public Android(String androidpush) {
        this.androidpush = androidpush;
    }

    public String getAndroidpush() {
        return androidpush;
    }

    public void setAndroidpush(String androidpush) {
        this.androidpush = androidpush;
    }
}
