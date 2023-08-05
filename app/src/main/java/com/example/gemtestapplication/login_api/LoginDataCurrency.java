package com.example.gemtestapplication.login_api;

import com.google.gson.annotations.SerializedName;

public class LoginDataCurrency {

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("prefix")
    private String prefix;

    @SerializedName("hospital")
    private String hospital;

    @SerializedName("country_id")
    private String country_id;

    public LoginDataCurrency(String symbol, String prefix, String hospital, String country_id) {
        this.symbol = symbol;
        this.prefix = prefix;
        this.hospital = hospital;
        this.country_id = country_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
}
