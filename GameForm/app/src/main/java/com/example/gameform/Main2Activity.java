package com.example.gameform;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {
    Intent in;
    Bundle bund;
    TextView name, company, age, type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView)findViewById(R.id.name);
        company = (TextView)findViewById(R.id.EditText3);
        age = (TextView)findViewById(R.id.EditTex4);
        type = (TextView)findViewById(R.id.EditText2);

        in = getIntent();
        bund = in.getExtras();

        name.setText(bund.getString("name").toString());
        company.setText(bund.getString("company").toString());
        type.setText(bund.getString("type").toString());
        age.setText(bund.getString("age").toString());
    }
}
