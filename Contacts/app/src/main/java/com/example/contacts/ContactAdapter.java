package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contacts> {
    private List<Contacts> contactsList = new ArrayList<>();
    public ContactAdapter(Context context, int textViewResourceId, ArrayList<Contacts> list) {
        super(context, 0 , list);
        contactsList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_list_layout, null);
        TextView name = (TextView)v.findViewById(R.id.name);
        TextView email = (TextView)v.findViewById(R.id.email);
        TextView contact = (TextView)v.findViewById(R.id.contact);
        ImageView profile = (ImageView)v.findViewById(R.id.imageView_poster);
        name.setText(contactsList.get(position).getContactName());
        email.setText(contactsList.get(position).getContactEmail());
        contact.setText(contactsList.get(position).getContactPhone());
        profile.setImageResource(contactsList.get(position).getImageDrawable());
        return v;
    }
}
