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
                Type 2 for Large""";
        System.out.println(menuChoice);
        int sizeChoice = Integer.parseInt(myScanner.nextLine());

        // assigning appropriate sandwich cost to costOfSandwich (large or regular)
        if (sizeChoice == 1) costOfSandwich += regularPrice;
        else if (sizeChoice == 2) costOfSandwich += largePrice;

        // asking if user wants a loaded sandwich
        System.out.println("Would you like your sandwich loaded? type y/n");
        char loadedChoice = myScanner.nextLine().charAt(0);
        // adding extra cost if sandwich is loaded
        if (loadedChoice == 'y' && sizeChoice == 1) costOfSandwich += 1.00;
        else if (loadedChoice == 'y' && sizeChoice == 2) costOfSandwich += 1.75;

        // Asking user for their age
        System.out.print("Please enter your age: ");
        int userAge = Integer.parseInt(myScanner.nextLine());

        // Calculating discount and printing cost to screen
        if (userAge <= 17) System.out.printf("Your total is: %.2f", (costOfSandwich - (costOfSandwich * .10)));

        else if (userAge >= 65) System.out.printf("Your total is: %.2f", (costOfSandwich - (costOfSandwich * .20)));

        else System.out.println("Your total is: " + costOfSandwich);
    }
}