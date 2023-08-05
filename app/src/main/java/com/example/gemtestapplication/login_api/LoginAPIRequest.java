package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class LoginAPIRequest {

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("device_id")
    private String device_id;

    @SerializedName("os_id")
    private String os_id;

    @SerializedName("time_zone")
    private String time_zone;

    @SerializedName("role_id")
    private String role_id;

    public LoginAPIRequest(String username, String password, String device_id, String os_id, String time_zone, String role_id) {
        this.username = username;
        this.password = password;
        this.device_id = device_id;
        this.os_id = os_id;
        this.time_zone = time_zone;
        this.role_id = role_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }
}
