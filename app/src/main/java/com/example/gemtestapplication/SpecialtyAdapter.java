package com.example.gemtestapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gemtestapplication.doctor_list_api.DoctorListData;
import com.example.gemtestapplication.doctor_list_api.Specialty;

import java.util.List;

public class SpecialtyAdapter extends RecyclerView.Adapter<SpecialtyViewHolder> {

    Context context;
    List<Specialty> specialties;
    int specialty_layout;

    public SpecialtyAdapter(List<Specialty> specialties, int specialty_layout, Context applicationContext) {

        this.context = applicationContext;
        this.specialties = specialties;
        this.specialty_layout = specialty_layout;
    }

    @NonNull
    @Override
    public SpecialtyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(specialty_layout,parent,false);
        SpecialtyViewHolder holder = new SpecialtyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialtyViewHolder holder, int position) {

        holder.specialty_text.setText(specialties.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return specialties.size();
    }
}
