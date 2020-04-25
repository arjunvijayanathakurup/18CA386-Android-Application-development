package com.example.backgroundchanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button changer;
    ConstraintLayout constLay;
    int[] imageList;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changer = (Button)findViewById(R.id.button);
        constLay = (ConstraintLayout)findViewById(R.id.constLayout);
        imageList = new int[]{R.drawable.bradley, R.drawable.jose, R.drawable.naail};
        i = 0;
    }

    public void changeBackground(View view) {
        constLay.setBackgroundResource(imageList[i]);
        i++;
        if(i > imageList.length){
            Toast t = Toast.makeText(getApplicationContext(), "No more images available!", Toast.LENGTH_LONG);
            t.show();
        }
    }
}
