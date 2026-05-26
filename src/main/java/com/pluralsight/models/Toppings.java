package com.pluralsight.models;

public class Toppings {
    private String name, category;

    public Toppings(String name, String category, boolean hasExtra) {
        this.name = name;
        this.category = category;
        this.hasExtra = hasExtra;
    }

    private boolean hasExtra;
}
