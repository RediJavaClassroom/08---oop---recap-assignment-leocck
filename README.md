# [Class 08 - OOP Recap Assignment](https://redi-school.github.io/intermediate-java/08-oop-recap)

## Description

We want to implement a rating system and apply it to Movies.
As the rating concept can be applied to several domains we will
decouple the rating system from the movie itself by using different classes.

## Tasks

### Step 1 - Implement Rating
In the package `com.redi.j2`, create a class to represent `Rating`.
Think of and add class implementation; the required behaviours for the `Rating` class are the followings:
1. `void addRating(int value)` adds new rating from user
2. `Double getRating()` returns the average of ratings

### Step 2 - Implement Movie
In the package `com.redi.j2`, create a class to represent `Movie`
Add the following public properties to the `Movie`
1. private member variables
    - `String title`
    - `String category`
    - `Rating rating`
2. Constructor that takes one argument (title)
3. `void setCategory(String category)` sets category
4. `String getCategory()` returns current category
5. `void setTitle(String title)` changes movie title
6. `String getTitle()` returns current title
7. `void addRating(int value)` adds new rating from user
8. `Double getRating()` returns the average of ratings

### Step 3 - the Ratable Interface
As we said the Rating class is generic and can be applied to different domains. This means we can
derive a concept of "Ratable" that can be applied to Movie, Restaurant, Products and so on.
This is usually reflected in Java as an Interface, that can be applied to several classes

Try to think to a `Ratable` interface that require the `addRating()` and `getRating()` functionalities
using the `Rating` class; let the Movie class implement it, and see if and how this affects the class signature and annotations.


## Want a Challenge? (Optional)

Is there anything else a `Ratable` object can share with other Ratables? 
- What about a full list of ratings of all the times?
- Or the date of the latest rating? 
- Try to improve the rating system by changing the Ratable interface, then the Movie and Rating classes.  
