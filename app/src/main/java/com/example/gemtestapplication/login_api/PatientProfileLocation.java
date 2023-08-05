package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class PatientProfileLocation {

    @SerializedName("id")
    private String id;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("door_no")
    private String doorNo;

    public PatientProfileLocation(String id, String userId, String doorNo, String streetName, String landMark, String locality, String postalCode, String phone1, String phone2, String notes, String countryId, String countryName, String stateId, String stateName, String cityId, String cityName) {
        this.id = id;
        this.userId = userId;
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.landMark = landMark;
        this.locality = locality;
        this.postalCode = postalCode;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.notes = notes;
        this.countryId = countryId;
        this.countryName = countryName;
        this.stateId = stateId;
        this.stateName = stateName;
        this.cityId = cityId;
        this.cityName = cityName;
    }

    @SerializedName("street_name")
    private String streetName;

    @SerializedName("landmark")
    private String landMark;

    @SerializedName("locality")
    private String locality;

    @SerializedName("postal_code")
    private String postalCode;

    @SerializedName("phone1")
    private String phone1;

    @SerializedName("phone2")
    private String phone2;

    @SerializedName("notes")
    private String notes;

    @SerializedName("country_id")
    private String countryId;

    @SerializedName("country_name")
    private String countryName;

    @SerializedName("state_id")
    private String stateId;

    @SerializedName("state_name")
    private String stateName;

    @SerializedName("city_id")
    private String cityId;

    @SerializedName("city_name")
    private String cityName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
