package com.example.gemtestapplication.login_api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface LoginAPIInterface  {

    @FormUrlEncoded
    @POST("default/login")
    Call<LoginAPIResponce> createPost(@Field("username") String username, @Field("password") String password,@Field("device_id") String device_id,@Field("os_id") String os_id, @Field("time_zone") String time_zone, @Field("role_id") String role_id);

}
