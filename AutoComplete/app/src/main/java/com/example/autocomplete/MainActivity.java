package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] cityName = {"Dubai", "Stockholm", "France", "Amsterdam", "Munich", "Berlin", "San Francisco", "Miami", "Hydrabad", "Kochi", "Paderbon"};
    AlertDialog.Builder alertdial;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autocomp = (AutoCompleteTextView)findViewById(R.id.simpleAutoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cityName);
        autocomp.setAdapter(adapter);
        autocomp.setThreshold(1);
        autocomp.setAdapter(adapter);
        alertdial = new AlertDialog.Builder(this);
        val = autocomp.getText().toString();
    }

    public void callEr(View view) {
        alertdial.setTitle("You have selected " + val + " as the preferred city");
        alertdial.setMessage("Are you sure,You want to continue?");
        alertdial.setCancelable(false);
    }
}
