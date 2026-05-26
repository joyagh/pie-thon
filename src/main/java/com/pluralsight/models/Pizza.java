package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size, crust;
    private boolean hasStuffedCrust;
    private List<Toppings> toppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public boolean isStuffedCrust() {
        return hasStuffedCrust;
    }

    public void setHasStuffedCrust(boolean hasStuffedCrust) {
        this.hasStuffedCrust = hasStuffedCrust;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public Pizza(String size, String crust, boolean hasStuffedCrust, List<Toppings> toppings) {
        this.size = size;
        this.crust = crust;
        this.hasStuffedCrust = hasStuffedCrust;
        this.toppings = new ArrayList<>();

    }
}
