package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ViewImage extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        Intent in  = getIntent();
        Bundle bund = in.getExtras();

        image = (ImageView)findViewById(R.id.imageView2);
        image.setImageResource(bund.getInt("image"));
    }
}
