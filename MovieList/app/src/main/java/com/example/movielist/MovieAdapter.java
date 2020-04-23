package com.example.movielist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movies> {
    private List<Movies> movieList = new ArrayList<>();
    public MovieAdapter(Context context, int textViewResourceId, ArrayList<Movies> list) {
        super(context, textViewResourceId , list);
        movieList = list;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_list_layout, null);
        TextView movieName = (TextView)v.findViewById(R.id.name);
        TextView movieDirector = (TextView)v.findViewById(R.id.directed);
        TextView year = (TextView) v.findViewById(R.id.year);
        ImageView profile = (ImageView)v.findViewById(R.id.imageView_poster);
        movieName.setText(movieList.get(position).getMovieName());
        movieDirector.setText(movieList.get(position).getMovieDirector());
        year.setText(Integer.toString(movieList.get(position).getYear()));
        ImageView forwardImage = (ImageView)v.findViewById(R.id.imageView);
        profile.setImageResource(movieList.get(position).getImageDrawable());
        forwardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movieInfo = new Intent(v.getContext(), DetailsActivity.class);
                Bundle bund = new Bundle();
                bund.putInt("image", movieList.get(position).getImageDrawable());
                bund.putString("name", movieList.get(position).getMovieName());
                bund.putString("director", movieList.get(position).getMovieDirector());
                bund.putString("description", movieList.get(position).getDescription());
                bund.putString("genre", movieList.get(position).getGenre());
                bund.putInt("year", movieList.get(position).getYear());
                movieInfo.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                movieInfo.putExtras(bund);
                v.getContext().startActivity(movieInfo);
            }
        });
        return v;
    }
}
