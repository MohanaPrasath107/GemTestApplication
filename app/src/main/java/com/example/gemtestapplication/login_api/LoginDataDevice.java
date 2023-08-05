package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class LoginDataDevice {

    @SerializedName("status")
    private String status;

    @SerializedName("device_id")
    private String device_id;

    @SerializedName("os_id")
    private String os_id;

    @SerializedName("voip_token")
    private String voip_token;

    public LoginDataDevice(String status, String device_id, String os_id, String voip_token) {
        this.status = status;
        this.device_id = device_id;
        this.os_id = os_id;
        this.voip_token = voip_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getOs_id() {
        return os_id;
    }

    public void setOs_id(String os_id) {
        this.os_id = os_id;
    }

    public String getVoip_token() {
        return voip_token;
    }

    public void setVoip_token(String voip_token) {
        this.voip_token = voip_token;
    }
}
