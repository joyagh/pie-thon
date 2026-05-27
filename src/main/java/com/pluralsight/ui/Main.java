package com.pluralsight.ui;

import com.pluralsight.models.*;


import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static boolean running = true;

    public static void main(String[] args) {


        while (running) {
            System.out.println("Welcome to Pie-thon!");
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
                  //  showAddPizzaScreen(order);
                    break;
                case 2:
                 //   showAddDrinkScreen(order);
                    break;
                case 3:
                  //  showAddGarlicKnotsScreen(order);
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



}