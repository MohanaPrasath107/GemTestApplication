package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class LoginAPIResponce {

    @SerializedName("success")
    private String success;

    @SerializedName("msg")
    private String msg;

    @SerializedName("data")
    private LoginData data;

    public LoginAPIResponce(String success, String msg, LoginData data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LoginData getData() {
        return data;
    }

    public void setData(LoginData data) {
        this.data = data;
    }
}
