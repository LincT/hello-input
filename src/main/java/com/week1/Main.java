package com.week1;

import static input.InputUtils.*;

/**
 * Input and output.
 */
public class Main {
    
    public static void main(String[] args) {
        
        /* Write your code here */
        /*
        String name = stringInput("Please enter your name?");
        System.out.println("Hello, " + name + "!");
        */
        double mms = doubleInput("How many M&Ms in a packet?");
        int people = intInput("How many people would like to share?");

        double mmsEach = mms/people;
        System.out.println("Each person will get "+ mmsEach + " M&Ms each.");
        
    }
    
}
