package com.week1;

import static input.InputUtils.*;

public class Distance {
    public static void main(String[] args) {
        //get distance in miles
        double miles = doubleInput("How many miles do you live from MCTC?");

        //convert to kilometers
        double kilometers = miles * 1.6;

        //display information for user
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        if (miles > 10){
            System.out.println("You live more than 10 miles from MCTC.");
        }
        else if (miles == 10){
            System.out.println("You live exactly 10 miles away from MCTC.");
        }
        else {
            System.out.println("You live less than 10 miles from MCTC.");
        }
    }
}
