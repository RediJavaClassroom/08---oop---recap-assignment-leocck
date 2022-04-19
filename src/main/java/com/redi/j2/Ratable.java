package com.redi.j2;

import java.time.LocalDateTime;
import java.util.List;

public interface Ratable {
    void addRating(int rating);
    Double getRating();
    List<Integer> getAllRatings();
    LocalDateTime getLastRatingTime();
}
