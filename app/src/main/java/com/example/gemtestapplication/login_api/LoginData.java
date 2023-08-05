package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class LoginData {

    @SerializedName("User")
    private User user;

    @SerializedName("Currency")
    private LoginDataCurrency currency;

    @SerializedName("PatientProfile")
    private PatientProfile patientProfile;

    @SerializedName("PatientProfileLocation")
    private PatientProfileLocation patientProfileLocation;

    @SerializedName("NotitificationDetails")
    private NotitificationDetails notitificationDetails;

    @SerializedName("counts")
    private Counts counts;

    @SerializedName("access_token")
    private String access_token;

    @SerializedName("userType")
    private String userType;

    @SerializedName("device")
    private LoginDataDevice device;

    @SerializedName("pushStatus")
    private PushStatus pushStatus;

    public LoginData(User user, LoginDataCurrency currency, PatientProfile patientProfile, PatientProfileLocation patientProfileLocation, NotitificationDetails notitificationDetails, Counts counts, String access_token, String userType, LoginDataDevice device, PushStatus pushStatus) {
        this.user = user;
        this.currency = currency;
        this.patientProfile = patientProfile;
        this.patientProfileLocation = patientProfileLocation;
        this.notitificationDetails = notitificationDetails;
        this.counts = counts;
        this.access_token = access_token;
        this.userType = userType;
        this.device = device;
        this.pushStatus = pushStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LoginDataCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(LoginDataCurrency currency) {
        this.currency = currency;
    }

    public PatientProfile getPatientProfile() {
        return patientProfile;
    }

    public void setPatientProfile(PatientProfile patientProfile) {
        this.patientProfile = patientProfile;
    }

    public PatientProfileLocation getPatientProfileLocation() {
        return patientProfileLocation;
    }

    public void setPatientProfileLocation(PatientProfileLocation patientProfileLocation) {
        this.patientProfileLocation = patientProfileLocation;
    }

    public NotitificationDetails getNotitificationDetails() {
        return notitificationDetails;
    }

    public void setNotitificationDetails(NotitificationDetails notitificationDetails) {
        this.notitificationDetails = notitificationDetails;
    }

    public Counts getCounts() {
        return counts;
    }

    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LoginDataDevice getDevice() {
        return device;
    }

    public void setDevice(LoginDataDevice device) {
        this.device = device;
    }

    public PushStatus getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(PushStatus pushStatus) {
        this.pushStatus = pushStatus;
    }
}
