package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView arrayList;
    ArrayList<Contacts> contactList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = (ListView)findViewById(R.id.listView);
        contactList.add(new Contacts(R.drawable.male_avatar, "Arjun V", "arjunv@gmail.com", "9432353563"));
        contactList.add(new Contacts(R.drawable.female_avatar, "Layla", "layla@gmail.com", "9432456325"));
        contactList.add(new Contacts(R.drawable.male_avatar, "Steve", "steve@gmail.com", "9455753563"));
        contactList.add(new Contacts(R.drawable.male_avatar, "Danny", "danny@gmail.com", "94475545563"));
        contactList.add(new Contacts(R.drawable.female_avatar, "Rachel", "rachel@gmail.com", "9546653563"));
        contactList.add(new Contacts(R.drawable.female_avatar, "Katherin", "kathy@gmail.com", "9432565763"));
        contactList.add(new Contacts(R.drawable.male_avatar, "Ryan", "ryau@gmail.com", "9432833463"));

        ContactAdapter myContact = new ContactAdapter(this, R.layout.activity_list_layout, contactList);
        arrayList.setAdapter(myContact);
    }
}
