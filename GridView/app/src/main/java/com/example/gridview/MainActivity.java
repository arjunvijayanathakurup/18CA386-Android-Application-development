package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Images> imageList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridView);
        imageList.add(new Images(R.drawable.undraw_at_home_octe));
        imageList.add(new Images(R.drawable.undraw_by_the_road_4rfk));
        imageList.add(new Images(R.drawable.undraw_cabin_hkfr));
        imageList.add(new Images(R.drawable.undraw_drone_surveillance_kjjg));
        imageList.add(new Images(R.drawable.undraw_friends_r511));
        imageList.add(new Images(R.drawable.undraw_group_video_el8e));
        imageList.add(new Images(R.drawable.undraw_happy_music_g6wc));
        imageList.add(new Images(R.drawable.undraw_online_video_ivvq));
        imageList.add(new Images(R.drawable.undraw_quite_town_mg2q));
        imageList.add(new Images(R.drawable.undraw_shopping_app_flsj));
        imageList.add(new Images(R.drawable.undraw_winter_walk_2yac));
        ImageAdapter imageAdapter = new ImageAdapter(this,R.layout.activity_grid_view,imageList);
        gridView.setAdapter(imageAdapter);
    }
}
