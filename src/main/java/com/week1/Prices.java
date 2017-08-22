package com.week1;

import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args){

        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does one " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");
        double totalPrice = price*quantity;

        System.out.println(quantity + " " + productName + " at $" + price + " each costs $" + totalPrice);

    }
}
