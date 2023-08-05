package com.example.gemtestapplication.doctor_list_api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DoctorList {


    @SerializedName("success")
    private boolean success;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private List<DoctorListData> doctorListData;

    public DoctorList(boolean success, String msg, List<DoctorListData> doctorListData) {
        this.success = success;
        this.msg = msg;
        this.doctorListData = doctorListData;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DoctorListData> getDoctorListData() {
        return doctorListData;
    }

    public void setDoctorListData(List<DoctorListData> doctorListData) {
        this.doctorListData = doctorListData;
    }
}
