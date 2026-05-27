package com.pluralsight.ui;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static boolean running = true;

    public static void main(String[] args) {



        while(running){
            System.out.println("Welcome to Pie-thon!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter Option Here");
        }
    }
}
