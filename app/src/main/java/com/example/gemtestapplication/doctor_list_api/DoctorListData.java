package com.example.gemtestapplication.doctor_list_api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DoctorListData {

    @SerializedName("id")
    private String id;
    @SerializedName("email")
    private String email;
    @SerializedName("specialty")
    private List<Specialty> specialties;
    @SerializedName("first_name")
    private String first_name;
    @SerializedName("name")
    private String name;
    @SerializedName("profile_picture")
    private String profile_picture;
    @SerializedName("online_status")
    private String online_status;
    @SerializedName("busy_on")
    private String busy_on;
    @SerializedName("rating")
    private String rating;
    @SerializedName("fixed_charge")
    private String fixed_charge;
    @SerializedName("additional_minutes")
    private String additional_minutes;
    @SerializedName("avaya_ext")
    private String avaya_ext;
    @SerializedName("avaya_username")
    private String avaya_username;
    @SerializedName("avaya_password")
    private String avaya_password;
    @SerializedName("state_id")
    private String state_id;
    @SerializedName("fixed_duration")
    private String fixed_duration;

    public DoctorListData(String id, String email, List<Specialty> specialties, String first_name, String name, String profile_picture, String online_status, String busy_on, String rating, String fixed_charge, String additional_minutes, String avaya_ext, String avaya_username, String avaya_password, String state_id, String fixed_duration) {
        this.id = id;
        this.email = email;
        this.specialties = specialties;
        this.first_name = first_name;
        this.name = name;
        this.profile_picture = profile_picture;
        this.online_status = online_status;
        this.busy_on = busy_on;
        this.rating = rating;
        this.fixed_charge = fixed_charge;
        this.additional_minutes = additional_minutes;
        this.avaya_ext = avaya_ext;
        this.avaya_username = avaya_username;
        this.avaya_password = avaya_password;
        this.state_id = state_id;
        this.fixed_duration = fixed_duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getOnline_status() {
        return online_status;
    }

    public void setOnline_status(String online_status) {
        this.online_status = online_status;
    }

    public String getBusy_on() {
        return busy_on;
    }

    public void setBusy_on(String busy_on) {
        this.busy_on = busy_on;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFixed_charge() {
        return fixed_charge;
    }

    public void setFixed_charge(String fixed_charge) {
        this.fixed_charge = fixed_charge;
    }

    public String getAdditional_minutes() {
        return additional_minutes;
    }

    public void setAdditional_minutes(String additional_minutes) {
        this.additional_minutes = additional_minutes;
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

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getFixed_duration() {
        return fixed_duration;
    }

    public void setFixed_duration(String fixed_duration) {
        this.fixed_duration = fixed_duration;
    }
}

