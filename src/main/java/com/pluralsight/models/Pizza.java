package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size, crust;
    private boolean hasStuffedCrust;
    private List<Toppings> toppings;

    public Pizza(String size, String crust, boolean hasStuffedCrust, List<Toppings> toppings) {
        this.size = size;
        this.crust = crust;
        this.hasStuffedCrust = hasStuffedCrust;
        this.toppings = new ArrayList<>();
        ;
    }
}
