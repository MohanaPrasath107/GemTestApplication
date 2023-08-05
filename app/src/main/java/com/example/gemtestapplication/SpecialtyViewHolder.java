package com.example.gemtestapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpecialtyViewHolder extends RecyclerView.ViewHolder {
    TextView specialty_text;

    public SpecialtyViewHolder(@NonNull View itemView) {
        super(itemView);
        specialty_text = itemView.findViewById(R.id.specialty_text);

    }
}
