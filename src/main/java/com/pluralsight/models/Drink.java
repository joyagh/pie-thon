package com.pluralsight.models;

public class Drink implements OrderItem {
    private String size;

    public Drink(String size) {
        this.size = size;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public double getPrice() {
        return 0;
    }
}
