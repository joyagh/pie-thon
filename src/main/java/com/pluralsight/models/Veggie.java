package com.pluralsight.models;

public class Veggie extends Pizza{
    public Veggie(){
        super("Personal 8\"","Regular",false);
        addToppings(new Toppings("Marinara", "regular", false));
        addToppings(new Toppings("Bell Peppers", "regular", false));
        addToppings(new Toppings("Spinach", "regular", false));
        addToppings(new Toppings("Olives", "regular", false));
        addToppings(new Toppings("Onions", "regular", false));
        addToppings(new Toppings("Mozzarella", "premium", false));

    }
}
