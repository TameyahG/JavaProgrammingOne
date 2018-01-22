package Chapter6;

import java.util.Scanner;

/**
 * This program takes money from, Euros, poundSterling and yen. Classing them together to get the amount or exact amount
 *
 * @author Tameyah Galindez
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Exchange rates
        double euroRate, poundSterlingRate, yenRate;
        // Dollars you are exchanging
        double dollars;
        // Currencies you are buying
        double eurosBought, poundSterlingBought = 0, yenBought;
        // Currency codes E-Euro, P-Pound, Y-Yen
        String currency;
        // User reply if they want to perform more conversions
        String reply;

        // Capturing the exchange rates
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        euroRate = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        poundSterlingRate = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        yenRate = input.nextDouble();

        // Loop
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            currency = input.next().toUpperCase();

            // Chosing a conversion to perform based on the user selection
            switch (currency) {
                case "E":
                    eurosBought = conversion(dollars, euroRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, eurosBought);
                    break;

                case "P":
                    poundSterlingRate = conversion(dollars, poundSterlingRate);
                    System.out.printf("For %.2f dollars, you will be able to but %.2f Pounds.\n", dollars, poundSterlingBought);
                    break;
            }

            // Asking the user if they want to perform more conversions
            do {
                System.out.print("Are there more conversions to perform? ");
                reply = input.next();
            } while (!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no"));

        } while (reply.equalsIgnoreCase("yes"));
    }
//Converts the currency by 0.95 and the exchange rate.
    public static double conversion(double dollars, double exchangeRate) {
        if (dollars > 100) {
            return (0.95 * dollars * exchangeRate);
        } else {
            return (0.90 * dollars * exchangeRate);
        }
    }
}
