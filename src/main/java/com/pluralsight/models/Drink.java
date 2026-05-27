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
        if (size.equalsIgnoreCase("Small")) {
            return 2.00;
        } else if (size.equalsIgnoreCase("Medium")) {
            return 2.50;
        }else if(size.equalsIgnoreCase("Large")){
            return 3.00;
        }
        return 0;
    }
}

