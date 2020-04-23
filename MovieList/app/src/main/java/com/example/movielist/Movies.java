package com.example.movielist;

public class Movies {
    private int imageDrawable;
    private String movieName;
    private String movieDirector;
    private String description;
    private String genre;
    private int year;

    public Movies(int imageDrawable, String movieName, String movieDirector, String description, int year, String genre){
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.description = description;
        this.genre = genre;
        this.year = year;
        this.imageDrawable = imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
