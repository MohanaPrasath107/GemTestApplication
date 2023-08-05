package com.example.gemtestapplication.doctor_list_api;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class DoctorListAPIClient {

    private static Retrofit retrofit = null;

    public static final String BASE_URL = "https://ahd.instapract.ae/web/api/";

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
