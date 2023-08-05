package com.example.gemtestapplication.doctor_list_api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DoctorListAPIInterface {

    @POST("doctor/doc-list")
    Call<DoctorList> getDoctorList();
}
