package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements OrderItem {
    private String size, crust;
    private boolean hasStuffedCrust;
    private List<Toppings> topping;

    public Pizza(String size, String crust, boolean hasStuffedCrust) {
        this.size = size;
        this.crust = crust;
        this.hasStuffedCrust = hasStuffedCrust;
        this.topping = new ArrayList<>();


    }

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
        return topping;
    }

    public void setToppings(List<Toppings> toppings) {
        this.topping = toppings;
    }


    public void addToppings(Toppings topping){
        this.topping.add(topping);

    }
    @Override
    public double getPrice() {
        double total = 0;
        if (size.equalsIgnoreCase("Personal 8\"")) {
        total = 8.50;
    } else if (size.equalsIgnoreCase("Medium 12\"")) {
        total = 12.00;
    } else if (size.equalsIgnoreCase("Large 16\"")) {
        total = 16.50;
    }
        return total;
    }

}

