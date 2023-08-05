package com.example.gemtestapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gemtestapplication.doctor_list_api.DoctorListData;

import java.util.List;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListViewHolder> {

    Context context;
    List<DoctorListData> doctorlist;
    int doctor_list;

    public DoctorListAdapter(List<DoctorListData> doctorlist, int doctor_list, Context applicationContext) {

        this.context = applicationContext;
        this.doctor_list = doctor_list;
        this.doctorlist = doctorlist;
    }

    @NonNull
    @Override
    public DoctorListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(doctor_list,parent,false);
        DoctorListViewHolder holder = new DoctorListViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorListViewHolder holder, int position) {

        holder.doctor_list_name.setText(doctorlist.get(position).getName());
        holder.doctor_list_name.setTag(holder);
        holder.doctor_list_name.setOnClickListener(clicklistner);
    }

    View.OnClickListener clicklistner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            DoctorListViewHolder reviewholder = (DoctorListViewHolder) view.getTag();
            int position = reviewholder.getPosition();

            Intent intent = new Intent(context, DoctorDetailsScreen.class);
            Bundle bundle = new Bundle();
            bundle.putInt("POSITION",position );
            intent.putExtras(bundle);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    };

    @Override
    public int getItemCount() {
        return doctorlist.size();
    }
}
