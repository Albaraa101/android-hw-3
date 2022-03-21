package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adobe_Programs extends ArrayAdapter<Programs> {
    List<Programs> programsList;


    public Adobe_Programs(@NonNull Context context, int resource, @NonNull List<Programs> objects) {
        super(context, resource, objects);

        programsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       View view = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);


        Programs currentItems = programsList.get(position);
        TextView programName = view.findViewById(R.id.itemName);
        TextView programPrice = view.findViewById(R.id.itemPrice);
        ImageView programImage = view.findViewById(R.id.imageView);

        programName.setText(currentItems.getProgramName());
        programImage.setImageResource(currentItems.getProgramImage());
        programPrice.setText(currentItems.getProgramPrice()+"$");

        return view;
    }
}
