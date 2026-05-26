package com.pluralsight.models;

public class GarlicKnots implements OrderItem{
    private int quantity;

    public GarlicKnots(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return 0;
    }
}
