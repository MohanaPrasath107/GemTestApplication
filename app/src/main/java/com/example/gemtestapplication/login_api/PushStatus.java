package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class PushStatus {

    @SerializedName("Android")
    private Android android;

    public PushStatus(Android android) {
        this.android = android;
    }

    public Android getAndroid() {
        return android;
    }

    public void setAndroid(Android android) {
        this.android = android;
    }
}
