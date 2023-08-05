package com.example.gemtestapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoctorListViewHolder extends RecyclerView.ViewHolder {

    TextView doctor_list_name;
    public DoctorListViewHolder(@NonNull View itemView) {
        super(itemView);

        doctor_list_name = itemView.findViewById(R.id.doctor_list_name);

    }
}
