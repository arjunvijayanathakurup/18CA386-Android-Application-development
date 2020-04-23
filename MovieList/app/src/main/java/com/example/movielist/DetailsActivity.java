package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView name, director, year, genre, description;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent in = getIntent();
        Bundle bund = in.getExtras();

        name = (TextView)findViewById(R.id.nameMovie);
        director = (TextView)findViewById(R.id.directorName);
        year = (TextView)findViewById(R.id.yearMovie);
        genre = (TextView)findViewById(R.id.genreMovie);
        description = (TextView)findViewById(R.id.descriptionMovie);
        image = (ImageView)findViewById(R.id.movieImage);

        image.setImageResource(bund.getInt("image"));
        name.setText(bund.getString("name"));
        director.setText(bund.getString("director"));
        year.setText(Integer.toString(bund.getInt("year")));
        genre.setText(bund.getString("genre"));
        description.setText(bund.getString("description"));

    }
}
