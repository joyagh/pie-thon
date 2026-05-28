package com.pluralsight.models;

public class Margherita extends Pizza{
    public Margherita(){
        super("Medium 12\"", "Regular", false);
        addToppings(new Toppings("Mozzarella", "premium", false));
        addToppings(new Toppings("Tomatoes", "regular", false));
        addToppings(new Toppings("Basil", "regular", false));
        addToppings(new Toppings("Marinara", "regular", false));
        addToppings(new Toppings("Olive Oil", "regular", false));
    }
}
