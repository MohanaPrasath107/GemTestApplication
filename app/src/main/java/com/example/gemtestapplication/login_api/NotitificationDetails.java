package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class NotitificationDetails {

    @SerializedName("totalpush")
    private int totalpush;

    @SerializedName("unread")
    private int unread;

    @SerializedName("read")
    private int read;

    @SerializedName("unnotified")
    private int unnotified;

    @SerializedName("notified")
    private int notified;

    @SerializedName("totalappointment")
    private int totalappointment;

    @SerializedName("totalcall")
    private int totalcall;

    public NotitificationDetails(int totalpush, int unread, int read, int unnotified, int notified, int totalappointment, int totalcall) {
        this.totalpush = totalpush;
        this.unread = unread;
        this.read = read;
        this.unnotified = unnotified;
        this.notified = notified;
        this.totalappointment = totalappointment;
        this.totalcall = totalcall;
    }

    public int getTotalpush() {
        return totalpush;
    }

    public void setTotalpush(int totalpush) {
        this.totalpush = totalpush;
    }

    public int getUnread() {
        return unread;
    }

    public void setUnread(int unread) {
        this.unread = unread;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getUnnotified() {
        return unnotified;
    }

    public void setUnnotified(int unnotified) {
        this.unnotified = unnotified;
    }

    public int getNotified() {
        return notified;
    }

    public void setNotified(int notified) {
        this.notified = notified;
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
