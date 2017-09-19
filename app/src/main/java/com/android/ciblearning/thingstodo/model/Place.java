package com.android.ciblearning.thingstodo.model;

import java.util.List;

/**
 * Created by sihlemabaleka on 9/19/17.
 */

public class Place {

    private String title;
    private List<PlaceItems> items;

    public Place() {
    }

    public Place(String title, List<PlaceItems> items) {
        this.title = title;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PlaceItems> getItems() {
        return items;
    }

    public void setItems(List<PlaceItems> items) {
        this.items = items;
    }
}
