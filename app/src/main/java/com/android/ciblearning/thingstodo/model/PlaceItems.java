package com.android.ciblearning.thingstodo.model;

/**
 * Created by sihlemabaleka on 9/19/17.
 */

public class PlaceItems {

    private String title, pictureUrl, shortDescription, location, availablitly, price, rating;

    public PlaceItems() {
    }

    public PlaceItems(String title, String pictureUrl, String shortDescription, String location, String availablitly, String price, String rating) {
        this.title = title;
        this.pictureUrl = pictureUrl;
        this.shortDescription = shortDescription;
        this.location = location;
        this.availablitly = availablitly;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvailablitly() {
        return availablitly;
    }

    public void setAvailablitly(String availablitly) {
        this.availablitly = availablitly;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
