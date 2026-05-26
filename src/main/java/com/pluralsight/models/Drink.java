package com.pluralsight.models;

public class Drink {
    private String size, flavor;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }
}
