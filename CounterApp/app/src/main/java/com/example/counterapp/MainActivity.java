package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int val;
    Button plus;
    Button minus;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val = 0;
        plus = (Button)findViewById(R.id.button);
        minus = (Button)findViewById(R.id.button2);
        display = (TextView)findViewById(R.id.display);
    }

    public void incrementCounter(View view) {
        val++;
        display.setText(" ");
        display.setText(Integer.toString(val));
    }

    public void decrementCounter(View view) {
        val--;
        display.setText(" ");
        display.setText(Integer.toString(val));
    }
}
