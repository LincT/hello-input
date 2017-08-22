package com.week1;

import static input.InputUtils.*;

public class Temp {
    public static void main(String[] args){
        //get month
        String month = stringInput("What month is it?");

        //get date
        int date = intInput("What date within " + month + "?");

        //get high
        double high = doubleInput("What is the expected high for the " + date + " of " + month);

        //get low
        double low = doubleInput("What is the expected low for the " + date + " of " + month);

        //math! (temp difference)
        double difference = high - low;

        //display information for user
        System.out.println("On the "+ date + " of " + month + " the difference between expected temperatures will be " +
        difference + " fahrenheit.");
    }
}
