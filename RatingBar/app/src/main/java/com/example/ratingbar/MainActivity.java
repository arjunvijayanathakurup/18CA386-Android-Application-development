package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ffs, sh;
    Float ffsr, shr;
    Button submit;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ffs = (RatingBar)findViewById(R.id.simpleRatingBar);
        sh = (RatingBar)findViewById(R.id.simpleRatingBar2);
        submit = (Button)findViewById(R.id.button);
        display = (TextView)findViewById(R.id.displayText);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ffsr = ffs.getRating();
                shr = sh.getRating();
                display.setText(" ");
                display.setText("Fast & Furious: " + Float.toString(ffsr) + "\n" + "Sherlock Holmes: " + Float.toString(shr));
            }
        });
    }
}
