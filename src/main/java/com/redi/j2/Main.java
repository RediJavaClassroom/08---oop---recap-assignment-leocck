package com.redi.j2;

public class Main {

    public static void main(String[] args) {

        Rating rating1 = new Rating(); // starts with 0
        rating1.addRating(1); // now it has 1 rating
        rating1.addRating(5); // now it has 2 ratings
        rating1.addRating(5);
        rating1.addRating(5);
        rating1.addRating(5);
        System.out.println("Average is: "+rating1.getRating());

        // ======================================================

        Movie movie1 = new Movie("Ring");
        System.out.println("Title: "+ movie1.getTitle());
        System.out.println("Category: "+ movie1.getCategory());
        movie1.setCategory("Horror");
        System.out.println("Category: "+ movie1.getCategory());

        movie1.addRating(5);
        movie1.addRating(3);
        System.out.println(movie1.getRating());
    }
}
