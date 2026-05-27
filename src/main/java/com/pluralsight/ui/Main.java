package com.pluralsight.ui;

import com.pluralsight.models.Pizza;

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
                      showOrderScreen();
                    break;
                case 0:
                    System.out.println("Pie Bye!");
                    running = false;

                default:
                    System.out.println("Invalid option. Please try again.");


            }
        }
    }

    public static void showOrderScreen(){
        while (running){
            System.out.println("What would you like to order?");
            System.out.println("1) Pies");
            System.out.println("2) Garlic Knots");
            System.out.println("3) Drinks");
            System.out.println("0) Home Menu");

            int option = input.nextInt();

            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Please Try again");
            }
        }
    }
}