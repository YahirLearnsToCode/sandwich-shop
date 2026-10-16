package com.pluralsight;

import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {

        double regularPrice = 5.45;
        double largePrice = 8.95;
        double costOfSandwich = 0;
        Scanner myScanner = new Scanner(System.in);

        // Asking for size of sandwich
        String menuChoice = """
                What size of sandwich would you like?
                Type 1 for Regular
                Type 2 for Large
                 """;
        System.out.print(menuChoice);
        int sizeChoice = Integer.parseInt(myScanner.nextLine());

        // assigning value to costOfSandwich
        if (sizeChoice == 1) costOfSandwich = regularPrice;
        else if (sizeChoice == 2) costOfSandwich = largePrice;

        // Asking user for their age
        System.out.print("Please enter your age: ");
        int userAge = Integer.parseInt(myScanner.nextLine());

        // Calculating discount and printing cost to screen
        if (userAge <= 17){
            System.out.printf("Your total is: %.2f", (costOfSandwich - (costOfSandwich * .10)));
        } else if (userAge >= 65 ) {
            System.out.printf("Your total is: %.2f", (costOfSandwich - (costOfSandwich * .20)));
        } else {
            System.out.println("Your total is: " + costOfSandwich);
        }
    }
}