package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView arrayList;
    ArrayList<Movies> movieList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = (ListView)findViewById(R.id.listView);
        movieList.add(new Movies(R.drawable.avatar, "Avatar", "James Cameron",
                "Jake, who is paraplegic, replaces his twin on the Na'vi inhabited Pandora for a corporate mission. After the natives accept him as one of their own, he must decide where his loyalties lie.",
                2009, "Sci-fi"));
        movieList.add(new Movies(R.drawable.godfather, "The Godfather", "Francis Ford Coppola", " The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son. ",
                1972, "Crime, Drama"));
        movieList.add(new Movies(R.drawable.darkknight, "The Dark Knight", "Christopher Nolan", " When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice. ",
                2008, "Action, Crime, Drama"));
        movieList.add(new Movies(R.drawable.lotr, "The Lord of the Rings: The Return of the King", "Peter Jackson", "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring. ", 2003,  "Adventure, Drama, Fantasy "));
        movieList.add(new Movies(R.drawable.intesteller, "Interstellar", "Christopher Nolan", " A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival. ", 2014, "Adventure, Drama, Sci-Fi "));
        movieList.add(new Movies(R.drawable.charlie, "Modern Times", "Charlie Chaplin" , " The Tramp struggles to live in modern industrial society with the help of a young homeless woman. ", 1936, "Comedy, Drama, Family"));

        MovieAdapter movieAdapter = new MovieAdapter(this, R.layout.activity_list_layout, movieList);
        arrayList.setAdapter(movieAdapter);
    }
}
