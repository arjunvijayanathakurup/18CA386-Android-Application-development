package com.example.gridview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter {
    ArrayList<Images> imageList = new ArrayList<>();

    public ImageAdapter(Context context, int textViewResourceId, ArrayList<Images> items){
        super(context, textViewResourceId, items);
        imageList = items;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_grid_view, null);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        imageView.setImageResource(imageList.get(position).getImageNo());
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageView = new Intent(v.getContext(), ViewImage.class);
                Bundle bund = new Bundle();
                bund.putInt("image", imageList.get(position).getImageNo());
                imageView.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                imageView.putExtras(bund);
                v.getContext().startActivity(imageView);
            }
        });
        return v;
    }
}
