package com.example.gemtestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gemtestapplication.login_api.LoginAPIClient;
import com.example.gemtestapplication.login_api.LoginAPIInterface;
import com.example.gemtestapplication.login_api.LoginAPIRequest;
import com.example.gemtestapplication.login_api.LoginAPIResponce;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String username ,password, device_id,os_id,time_zone, role_id;
    EditText editTextUsername,editTextTextPassword;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = "patient";
        password = "Test@987";
        device_id = "55c3389cb5ddd720dc0297617f3561c43a36218a277c974c8d43d545a643f45c";
        os_id = "b93a9204-ee21-4cf9-8a94-cf5eeabf7301";
        time_zone = "Asia/Calcutta";
        role_id = "143f37f2-ca38-0ab1-2489-1e47113655fc";
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        loginButton = (Button) findViewById(R.id.loginButton);

        //LoginAPIRequest request = new LoginAPIRequest(username ,password, device_id,os_id,time_zone, role_id);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LoginAPIInterface apiService =
                        LoginAPIClient.getClient().create(LoginAPIInterface.class);
                Call<LoginAPIResponce> call = apiService.createPost(editTextUsername.getText().toString() ,editTextTextPassword.getText().toString(), device_id,os_id,time_zone, role_id);

                call.enqueue(new Callback<LoginAPIResponce>() {
                    @Override
                    public void onResponse(Call<LoginAPIResponce> call, Response<LoginAPIResponce> response) {

                        LoginAPIResponce apiResponce = response.body();

                        if (apiResponce != null && apiResponce.getSuccess().toString() == "true"){
                            Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this,DoctorListScreen.class);
                            startActivity(intent);
                        }
                        if (apiResponce == null){
                            Toast.makeText(MainActivity.this,"Check your Username or Password",Toast.LENGTH_LONG).show();
                        }if (apiResponce != null && apiResponce.getSuccess().toString() == "0"){
                            Toast.makeText(MainActivity.this,"Check your Username or Password",Toast.LENGTH_LONG).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<LoginAPIResponce> call, Throwable t) {

                    }
                });

            }
        });

    }
}