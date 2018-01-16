package Chapter3;

import java.util.Scanner;

/**
 * Codes demonstrates the first number determining if it is lower/greater than
 * the second number
 *
 * @author Tameyah Galindez
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //enter scanner
        Scanner input = new Scanner(System.in);
        //first number
        System.out.println("Enter first number: ");
        double number1 = input.nextDouble();

        //second number
        System.out.println("Enter second number: ");
        double number2 = input.nextDouble();

        //#5
        if (number1 < number2) {
            System.out.println(" The first number is less than the second ");
        }

        //#6
        if (number1 > number2) {
            System.out.println(" The first number is greater than the second ");
        }

        //#7
        if (number1 == number2) {
            System.out.println(" The first number is equal to the second ");
        }

        //#8
        if (number1 <= number2) {
            System.out.println(" The first number is less than or equal to the second ");
        }

        // #9
        if (number1 != number2) {
            System.out.println(" The first number is not equal to the second ");
        }

        //#10
        if (number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if ((number1 / number2) < 1) {
            System.out.println(" proper fraction ");
        } else {
            System.out.println(" improper fraction ");
        }

        //#11
        if (number1 >= 90) {
            System.out.println(" A ");
        } else if (number1 >= 80) {
            System.out.println(" B ");
        } else if (number1 >= 70) {
            System.out.println(" C ");
        } else if (number1 >= 60) {
            System.out.println(" D ");
        } else {
            System.out.println(" F ");
        }

        //#12
        if ((1 <= number2) && (number2 <= 100)) {
            System.out.println(" In range ");
        } else {
            System.out.println("Out of range");
        }
    }
}
