package com.arcturusx.eatery.domain;

/**
 * Created by bruntha on 2/1/16.
 */
public class FoodRating {
    String restaurantID;
    double rating;

    public FoodRating(String restaurantID, double rating) {
        this.restaurantID = restaurantID;
        this.rating = rating;
    }

    public FoodRating() {
    }

    public String getRestaurantID() {

        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
