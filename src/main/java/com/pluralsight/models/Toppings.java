package com.pluralsight.models;

public class Toppings {
    private String name, category;

    public Toppings(String name, String category, boolean hasExtra) {
        this.name = name;
        this.category = category;
        this.hasExtra = hasExtra;
    }

    public boolean isHasExtra() {
        return hasExtra;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    private boolean hasExtra;
}
