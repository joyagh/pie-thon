package com.pluralsight.ui;

import com.pluralsight.models.*;


import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static boolean running = true;

    public static void main(String[] args) {


        while (running) {
            System.out.println("\n===Welcome to Pie-thon!===");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter Option Here: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    showOrderScreen(new Order());
                    break;
                case 0:
                    System.out.println("Pie Bye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");


            }
        }
    }

    public static void showOrderScreen(Order order) {
        boolean onOrderScreen = true;

        while (onOrderScreen) {
            System.out.println("\n=== Order Screen ===");
            System.out.println("1) Add Pizza");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Garlic Knots");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order - Back to Home");
            System.out.print("Enter Option Here: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    showAddPizzaScreen(order);
                    break;
                case 2:
                    showAddDrinkScreen(order);
                    break;
                case 3:
                    showAddGarlicKnotsScreen(order);
                    break;
                case 4:
                    //  showCheckoutScreen(order);
                    break;
                case 0:
                    System.out.println("Order cancelled. Returning home...");
                    onOrderScreen = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void showAddPizzaScreen(Order order) {
        System.out.println("\n=== Add Your Pie!===");
        String[] sizes = {"Personal 8\"", "Medium 12\"", "Large 16\""};
        System.out.println("""
                Select size: 
                1) Personal - 8"
                2) Medium - 12"
                3) Large - 16"
                """);

        int sizeChoice = input.nextInt();
        String size = sizes[sizeChoice - 1];

        String[] crusts = {"Thin", "Regular", "Thick", "Cauliflower"};
        System.out.println("""
                Select crust:
                1) Thin
                2) Regular
                3) Thick
                4) Cauliflower
                """);
        int crustChoice = input.nextInt();
        String crust = crusts[crustChoice - 1];

        System.out.print("Would you like stuffed crust? (y/n): ");
        boolean stuffedCrust = input.next().equalsIgnoreCase("y");

        Pizza pizza = new Pizza(size, crust, stuffedCrust);

        showToppingsScreen(pizza);

        order.addItem(pizza);
        System.out.println("Pie has been added to your order!");

    }

    public static void showToppingsScreen(Pizza pizza) {
        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("""
                    \n=== Toppings ===
                    1) Meat
                    2) Cheese
                    3) Other Toppings
                    0) Done
                    """);

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    String[] meats = {"Pepperoni", "Sausage", "Ham", "Bacon", "Chicken", "Meatball"};
                    System.out.println("""
                            Select meat:
                            1) Pepperoni  
                            2) Sausage 
                            3) Ham
                            4) Bacon      
                            5) Chicken  
                            6) Meatball
                            """);
                    int meatChoice = input.nextInt();
                    input.nextLine();
                    String meatName = meats[meatChoice - 1];
                    System.out.print("Extra " + meatName + "? (y/n): ");
                    boolean extraMeat = input.next().equalsIgnoreCase("y");
                    pizza.addToppings(new Toppings(meatName, "premium", extraMeat));
                    System.out.println(meatName + " added!");
                    break;
                case 2:
                    String[] cheeses = {"Mozzarella", "Parmesan", "Ricotta", "Goat Cheese", "Buffalo"};
                    System.out.println("""
                            Select cheese:
                            1) Mozzarella  
                            2) Parmesan  
                            3) Ricotta
                            4) Goat Cheese 
                            5) Buffalo
                            """);
                    int cheeseChoice = input.nextInt();
                    input.nextLine();
                    String cheeseName = cheeses[cheeseChoice - 1];
                    System.out.print("Extra " + cheeseName + "? (y/n): ");
                    boolean extraCheese = input.next().equalsIgnoreCase("y");
                    pizza.addToppings(new Toppings(cheeseName, "premium", extraCheese));
                    System.out.println(cheeseName + " added!");
                    break;
                case 3:
                    String[] others = {"Onions", "Mushrooms", "Bell Peppers", "Olives", "Tomatoes", "Spinach", "Basil", "Pineapple", "Anchovies"};
                    System.out.println("""
                            Select topping:
                            1) Onions 
                            2) Mushrooms    
                            3) Bell Peppers
                            4) Olives       
                            5) Tomatoes     
                            6) Spinach
                            7) Basil        
                            8) Pineapple   
                            9) Anchovies
                            """);
                    int otherChoice = input.nextInt();
                    input.nextLine();
                    pizza.addToppings(new Toppings(others[otherChoice - 1], "regular", false));
                    System.out.println(others[otherChoice - 1] + " added!");
                    break;
                case 0:
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }

    }


    public static void showAddDrinkScreen(Order order) {
        System.out.println("\n=== Add a Drink ===");
        String[] sizes = {"Small", "Medium", "Large"};
        System.out.println("""
                Select size:
                1) Small
                2) Medium
                3) Large
                """);
        int sizeChoice = input.nextInt();
        String size = sizes[sizeChoice - 1];
        order.addItem(new Drink(size));
        System.out.println("Drink added to your order!");

    }

    public static void showAddGarlicKnotsScreen(Order order) {
        System.out.print("How many orders of garlic knots? ");
        int quantity = input.nextInt();
        order.addItem(new GarlicKnots(quantity));
        System.out.println("Garlic Knots added to your order!");
    }
}


