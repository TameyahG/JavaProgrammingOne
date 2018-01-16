package Chapter2;

import java.util.Scanner;

/**
 * Shows the price, if you were to go to a diner or place to eat, and that
 * amount.
 *
 * @author Tameyah Galindez
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of meal");
        double mealprice = input.nextDouble();
        System.out.println("Enter price of drink");
        double drinkprice = input.nextDouble();
        System.out.println("Enter price of dessert");
        double dessertprice = input.nextDouble();
        double meal = (mealprice + drinkprice + dessertprice);

        System.out.print("Price of food is " + meal);
        double tax = (meal * 0.10);
        double tip = (meal + tax) * 0.15;
        double total = (meal + tax + tip);

        System.out.println(" Tax is " + tax + " Tip is " + tip + " Total is " + total);

    }
}
