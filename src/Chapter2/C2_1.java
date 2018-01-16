package Chapter2;

import java.util.Scanner;

/**
 * The following code finds out the degrees in Celsius
 *
 * @author Tameyah Galindez
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius");
        double Celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5 * Celsius) + 32;
        System.out.println(fahrenheit);
    }
}
