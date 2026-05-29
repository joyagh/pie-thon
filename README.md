# 🍕 Pie-thon

A Java-based point of sale application for **Pie-thon**, a custom pizza shop. Built as a Capstone 2 project for Year Up United.

## Description

Pie-thon is a command-line application that allows customers to place fully customized pizza orders. Customers can build their own pizzas from scratch, choose from signature pizzas, add drinks and garlic knots, and receive a receipt upon checkout.

## Features

- **Custom Pizza Builder** — choose size, crust, toppings, sauces, sides, and stuffed crust
- **Signature Pizzas** — pre-built Margherita and Veggie pizzas (customizable)
- **Drinks** — available in Small, Medium, and Large
- **Garlic Knots** — add as many orders as you'd like
- **Pricing** — automatic price calculation based on size and toppings
- **Receipt Generation** — saves a `.txt` receipt file to a `receipts/` folder on checkout
- **Input Validation** — handles invalid input gracefully throughout the app

## Technologies Used

- Java
- Maven

## OOP Concepts Used

- **Interfaces** — `OrderItem` interface implemented by `Pizza`, `Drink`, and `GarlicKnots`
- **Polymorphism** — `Order` holds a `List<OrderItem>` and calls `getPrice()` on each item
- **Inheritance** — `Margherita` and `Veggie` extend `Pizza`
- **Generics** — `List<OrderItem>`, `List<Toppings>` throughout the application
- **Encapsulation** — all fields are private with getters and setters

## How to Use

1. Select **1) New Order** from the home screen
2. Add pizzas, drinks, and garlic knots to your order
3. Select **4) Checkout** to review your order and confirm
4. Your receipt will be saved to the `receipts/` folder

   <img width="724" height="720" alt="Screenshot 2026-05-29 at 8 10 56 AM" src="https://github.com/user-attachments/assets/5ba58361-f29b-44e3-803a-700f4af1d2f1" />



## Author

Justine — Year Up United, Application Development
