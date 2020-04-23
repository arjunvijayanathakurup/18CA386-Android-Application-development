package com.example.gamelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    String GameList[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.gameList);
        GameList = new String[]{"Call of Duty: Warzone", "Fortnite", "Warframe", "Farcry4", "Valorant", "CS:GO", "Player unknows battle ground", "Starcraft2", "League of Legends", "Dota2"};
        adapter = new ArrayAdapter<String>(this, R.layout.activity_main2, R.id.textView, GameList);
        listView.setAdapter(adapter);
    }
}
