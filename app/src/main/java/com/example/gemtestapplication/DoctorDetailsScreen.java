package com.example.gemtestapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.gemtestapplication.doctor_list_api.DoctorList;
import com.example.gemtestapplication.doctor_list_api.DoctorListAPIClient;
import com.example.gemtestapplication.doctor_list_api.DoctorListAPIInterface;
import com.example.gemtestapplication.doctor_list_api.DoctorListData;
import com.example.gemtestapplication.doctor_list_api.Specialty;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class DoctorDetailsScreen extends AppCompatActivity {

    ImageView doctor_img;
    TextView doctor_name,doctor_email,doctor_status,doctor_busyon;
    RatingBar ratingBar;
    RecyclerView specialty_recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details_screen);

        doctor_img = (ImageView) findViewById(R.id.doctor_img);
        doctor_name = (TextView) findViewById(R.id.doctor_name);
        doctor_email = (TextView) findViewById(R.id.doctor_email);
        doctor_status = (TextView) findViewById(R.id.doctor_status);
        doctor_busyon = (TextView) findViewById(R.id.doctor_busyon);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        specialty_recycler = (RecyclerView) findViewById(R.id.specialty_recycler);
        Bundle bundle = getIntent().getExtras();
        int position = bundle.getInt("POSITION", 0);

        DoctorListAPIInterface apiService =
                DoctorListAPIClient.getClient().create(DoctorListAPIInterface.class);

        Call<DoctorList> call = apiService.getDoctorList();
        call.enqueue(new retrofit2.Callback<DoctorList>() {
            @Override
            public void onResponse(Call<DoctorList> call, Response<DoctorList> response) {

                DoctorListData doctorlist = response.body().getDoctorListData().get(position);

                doctor_name.setText(doctorlist.getName());
                doctor_email.setText(doctorlist.getEmail());
                doctor_status.setText(doctorlist.getOnline_status());
                doctor_busyon.setText(doctorlist.getBusy_on());
                ratingBar.setRating(Float.parseFloat(doctorlist.getRating()));
                specialty_recycler.setAdapter(new SpecialtyAdapter(doctorlist.getSpecialties(),R.layout.specialty_layout,getApplicationContext()));
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(DoctorDetailsScreen.this, LinearLayoutManager.VERTICAL, false);
                specialty_recycler.setLayoutManager(layoutManager);

                Picasso.get()
                        .load(doctorlist.getProfile_picture()).fit()
                        .into(doctor_img, new Callback() {
                            @Override
                            public void onSuccess() {

                            }

                            @Override
                            public void onError(Exception e) {

                            }
                        });

            }

            @Override
            public void onFailure(Call<DoctorList> call, Throwable t) {

            }


        });



    }
}