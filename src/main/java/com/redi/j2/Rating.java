package com.redi.j2;

import java.util.ArrayList;
import java.util.List;

public class Rating {

    private List<Integer> ratings;

    public Rating() {
        ratings = new ArrayList<>();
    }

    // adds new rating
    public void addRating(int value) {
        ratings.add(value);
    }

    public Double getRating() {
        int counter = 0;
        for(Integer rating : ratings) {
            counter += rating;
        }
        return counter / (double)ratings.size();
    }
}
