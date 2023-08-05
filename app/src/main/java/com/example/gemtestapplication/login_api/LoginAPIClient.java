package com.example.gemtestapplication.login_api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class LoginAPIClient {

    private static Retrofit retrofit = null;

    public static final String BASE_URL = "https://ahd.instapract.ae/web/api/";


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(new OkHttpClient.Builder()
                            .addInterceptor(new Interceptor() {
                                @Override
                                public Response intercept(Chain chain) throws IOException {
                                    Request newRequest = chain.request().newBuilder()
                                            .addHeader("APPID", "APPQUEOY6M")
                                            .addHeader("Content-Type","application/json")
                                            .addHeader("lang","da315627-3ece-2016-c628-b61dc5ee9be0")
                                            .build();
                                    return chain.proceed(newRequest);
                                }
                            })
                            .build())
                    .build();
        }
        return retrofit;
    }

}
