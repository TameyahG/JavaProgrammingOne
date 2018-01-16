package Chapter2;

import java.util.Scanner;

/**
 * The following code shows the Subtotal and gratuity rate for, whatever reason
 * and shows in the consol.
 *
 * @author Tameyah Galindez
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double gratuityrate = gratuity / 100 * subtotal;

        System.out.println(" gratuity " + gratuityrate + " subtotal " + subtotal);
    }
}
