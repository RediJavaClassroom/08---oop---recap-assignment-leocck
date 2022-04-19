package com.redi.j2;

public class Movie implements Ratable {

    private String title;
    private String category;
    private Rating rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Movie(String title) {
        this.title = title;
        category = "Default";
        rating = new Rating();
    }

    public void addRating(int value) {
        rating.addRating(value);
    }

    public Double getRating() {
        return rating.getRating();
    }
}
