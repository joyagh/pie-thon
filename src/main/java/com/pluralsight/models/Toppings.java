package com.pluralsight.models;

public class Toppings {
    private String name, category;
    private boolean hasExtra;

    public Toppings(String name, String category, boolean hasExtra) {
        this.name = name;
        this.category = category;
        this.hasExtra = hasExtra;
    }

    public boolean isExtra() {
        return hasExtra;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }


}
