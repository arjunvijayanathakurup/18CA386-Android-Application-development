package com.example.gameform;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText name, company, type, age;
    Button submit;
    Bundle bund;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        company = (EditText)findViewById(R.id.company);
        type = (EditText)findViewById(R.id.type);
        age = (EditText)findViewById(R.id.agegroup);
        submit = (Button)findViewById(R.id.submit);
        bund = new Bundle();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bund.putString("name", name.getText().toString());
                bund.putString("company", company.getText().toString());
                bund.putString("type", type.getText().toString());
                bund.putString("age", age.getText().toString());

                Intent ind = new Intent(MainActivity.this, Main2Activity.class);
                ind.putExtras(bund);
                startActivity(ind);
            }
        });
    }
}
