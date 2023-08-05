package com.example.gemtestapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gemtestapplication.doctor_list_api.DoctorList;
import com.example.gemtestapplication.doctor_list_api.DoctorListAPIClient;
import com.example.gemtestapplication.doctor_list_api.DoctorListAPIInterface;
import com.example.gemtestapplication.doctor_list_api.DoctorListData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoctorListScreen extends AppCompatActivity {

    TextView totaldoctor;
    RecyclerView doctorListRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list_screen);

        totaldoctor = (TextView) findViewById(R.id.totaldoctor);
        doctorListRecycler = (RecyclerView) findViewById(R.id.doctorListRecycler);

        DoctorListAPIInterface apiService =
                DoctorListAPIClient.getClient().create(DoctorListAPIInterface.class);

        Call<DoctorList> call = apiService.getDoctorList();
        call.enqueue(new Callback<DoctorList>() {
            @Override
            public void onResponse(Call<DoctorList> call, Response<DoctorList> response) {

                List<DoctorListData> doctorlist = response.body().getDoctorListData();
                totaldoctor.setText(response.body().getMsg());
                doctorListRecycler.setAdapter(new DoctorListAdapter(doctorlist,R.layout.doctor_list,getApplicationContext()));
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(DoctorListScreen.this, LinearLayoutManager.VERTICAL, false);
                doctorListRecycler.setLayoutManager(layoutManager);
            }

            @Override
            public void onFailure(Call<DoctorList> call, Throwable t) {

            }


        });

    }
}