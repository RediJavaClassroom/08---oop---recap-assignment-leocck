package com.redi.j2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Ratable {

    private String title;
    private String category;
    private Rating rating;
    private List<Integer> allRatings = new ArrayList<>();
    private LocalDateTime lastRatingTime;

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
        allRatings.add(value);
        lastRatingTime = LocalDateTime.now();
    }

    public Double getRating() {
        return rating.getRating();
    }

    @Override
    public List<Integer> getAllRatings() {
        return allRatings;
    }

    @Override
    public LocalDateTime getLastRatingTime() {
        return lastRatingTime;
    }
}
