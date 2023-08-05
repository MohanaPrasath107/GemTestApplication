package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private String id;

    @SerializedName("username")
    private String username;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("status")
    private int status;

    @SerializedName("hospital_id")
    private String hospital_id;

    @SerializedName("avaya_ext")
    private String avaya_ext;

    @SerializedName("avaya_username")
    private String avaya_username;

    @SerializedName("avaya_password")
    private String avaya_password;

    @SerializedName("ribbon_ext")
    private String ribbon_ext;

    @SerializedName("ribbon_username")
    private String ribbon_username;

    @SerializedName("ribbon_password")
    private String ribbon_password;

    public User(String id, String username, String email, String password, int status, String hospital_id, String avaya_ext, String avaya_username, String avaya_password, String ribbon_ext, String ribbon_username, String ribbon_password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.status = status;
        this.hospital_id = hospital_id;
        this.avaya_ext = avaya_ext;
        this.avaya_username = avaya_username;
        this.avaya_password = avaya_password;
        this.ribbon_ext = ribbon_ext;
        this.ribbon_username = ribbon_username;
        this.ribbon_password = ribbon_password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getAvaya_ext() {
        return avaya_ext;
    }

    public void setAvaya_ext(String avaya_ext) {
        this.avaya_ext = avaya_ext;
    }

    public String getAvaya_username() {
        return avaya_username;
    }

    public void setAvaya_username(String avaya_username) {
        this.avaya_username = avaya_username;
    }

    public String getAvaya_password() {
        return avaya_password;
    }

    public void setAvaya_password(String avaya_password) {
        this.avaya_password = avaya_password;
    }

    public String getRibbon_ext() {
        return ribbon_ext;
    }

    public void setRibbon_ext(String ribbon_ext) {
        this.ribbon_ext = ribbon_ext;
    }

    public String getRibbon_username() {
        return ribbon_username;
    }

    public void setRibbon_username(String ribbon_username) {
        this.ribbon_username = ribbon_username;
    }

    public String getRibbon_password() {
        return ribbon_password;
    }

    public void setRibbon_password(String ribbon_password) {
        this.ribbon_password = ribbon_password;
    }
}
