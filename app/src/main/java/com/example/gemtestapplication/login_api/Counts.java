package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class Counts {

    @SerializedName("todayappointment")
    private int todayappointment;

    @SerializedName("todaycall")
    private int todaycall;

    @SerializedName("totalappointment")
    private int totalappointment;

    @SerializedName("totalcall")
    private int totalcall;

    public Counts(int todayappointment, int todaycall, int totalappointment, int totalcall) {
        this.todayappointment = todayappointment;
        this.todaycall = todaycall;
        this.totalappointment = totalappointment;
        this.totalcall = totalcall;
    }

    public int getTodayappointment() {
        return todayappointment;
    }

    public void setTodayappointment(int todayappointment) {
        this.todayappointment = todayappointment;
    }

    public int getTodaycall() {
        return todaycall;
    }

    public void setTodaycall(int todaycall) {
        this.todaycall = todaycall;
    }

    public int getTotalappointment() {
        return totalappointment;
    }

    public void setTotalappointment(int totalappointment) {
        this.totalappointment = totalappointment;
    }

    public int getTotalcall() {
        return totalcall;
    }

    public void setTotalcall(int totalcall) {
        this.totalcall = totalcall;
    }
}
