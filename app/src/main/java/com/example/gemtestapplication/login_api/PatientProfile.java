package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class PatientProfile {
    @SerializedName("id")
    private String id;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("salute")
    private String salute;

    @SerializedName ("first_name")
    private String firstName;

    @SerializedName ("middle_name")
    private String middleName;

    @SerializedName ("last_name")
    private String lastName;

    @SerializedName ("suffix")
    private String suffix;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName ("gender")
    private String gender;

    @SerializedName ("expiry_date")
    private String expiryDate;

    @SerializedName ("nationality")
    private String nationality;

    @SerializedName ("dob")
    private String dateOfBirth;

    @SerializedName ("alternate_email")
    private String alternateEmail;

    @SerializedName ("sys_language_id")
    private String sysLanguageId;

    @SerializedName ("ssno")
    private String ssno;

    @SerializedName ("profile_picture")
    private String profilePicture;

    @SerializedName ("height")
    private String height;

    @SerializedName ("weight")
    private String weight;

    @SerializedName ("bmi")
    private String bmi;

    @SerializedName ("linkedin_url")
    private String linkedInUrl;

    @SerializedName ("website_url")
    private String websiteUrl;

    @SerializedName ("note")
    private String note;

    @SerializedName ("sys_ethnicity_id")
    private String sysEthnicityId;

    @SerializedName ("sys_race_id")
    private String sysRaceId;

    @SerializedName ("sys_time_zone_id")
    private String sysTimeZoneId;

    @SerializedName ("insurance_front_side")
    private String insuranceFrontSide;

    @SerializedName ("insurance_back_side")
    private String insuranceBackSide;

    @SerializedName ("driving_licence")
    private String drivingLicence;

    @SerializedName ("preferedlxanguageid")
    private String preferedLanguageId;

    @SerializedName ("preferedlanguagename")
    private String preferedLanguageName;

    public PatientProfile(String id, String userId, String salute, String firstName, String middleName, String lastName, String suffix, String displayName, String gender, String expiryDate, String nationality, String dateOfBirth, String alternateEmail, String sysLanguageId, String ssno, String profilePicture, String height, String weight, String bmi, String linkedInUrl, String websiteUrl, String note, String sysEthnicityId, String sysRaceId, String sysTimeZoneId, String insuranceFrontSide, String insuranceBackSide, String drivingLicence, String preferedLanguageId, String preferedLanguageName) {
        this.id = id;
        this.userId = userId;
        this.salute = salute;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.displayName = displayName;
        this.gender = gender;
        this.expiryDate = expiryDate;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.alternateEmail = alternateEmail;
        this.sysLanguageId = sysLanguageId;
        this.ssno = ssno;
        this.profilePicture = profilePicture;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.linkedInUrl = linkedInUrl;
        this.websiteUrl = websiteUrl;
        this.note = note;
        this.sysEthnicityId = sysEthnicityId;
        this.sysRaceId = sysRaceId;
        this.sysTimeZoneId = sysTimeZoneId;
        this.insuranceFrontSide = insuranceFrontSide;
        this.insuranceBackSide = insuranceBackSide;
        this.drivingLicence = drivingLicence;
        this.preferedLanguageId = preferedLanguageId;
        this.preferedLanguageName = preferedLanguageName;
    }

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

    public String getSalute() {
        return salute;
    }

    public void setSalute(String salute) {
        this.salute = salute;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getSysLanguageId() {
        return sysLanguageId;
    }

    public void setSysLanguageId(String sysLanguageId) {
        this.sysLanguageId = sysLanguageId;
    }

    public String getSsno() {
        return ssno;
    }

    public void setSsno(String ssno) {
        this.ssno = ssno;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSysEthnicityId() {
        return sysEthnicityId;
    }

    public void setSysEthnicityId(String sysEthnicityId) {
        this.sysEthnicityId = sysEthnicityId;
    }

    public String getSysRaceId() {
        return sysRaceId;
    }

    public void setSysRaceId(String sysRaceId) {
        this.sysRaceId = sysRaceId;
    }

    public String getSysTimeZoneId() {
        return sysTimeZoneId;
    }

    public void setSysTimeZoneId(String sysTimeZoneId) {
        this.sysTimeZoneId = sysTimeZoneId;
    }

    public String getInsuranceFrontSide() {
        return insuranceFrontSide;
    }

    public void setInsuranceFrontSide(String insuranceFrontSide) {
        this.insuranceFrontSide = insuranceFrontSide;
    }

    public String getInsuranceBackSide() {
        return insuranceBackSide;
    }

    public void setInsuranceBackSide(String insuranceBackSide) {
        this.insuranceBackSide = insuranceBackSide;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public String getPreferedLanguageId() {
        return preferedLanguageId;
    }

    public void setPreferedLanguageId(String preferedLanguageId) {
        this.preferedLanguageId = preferedLanguageId;
    }

    public String getPreferedLanguageName() {
        return preferedLanguageName;
    }

    public void setPreferedLanguageName(String preferedLanguageName) {
        this.preferedLanguageName = preferedLanguageName;
    }
}
