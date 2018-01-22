package Chapter5;

import java.util.Scanner;

/**
 * This program, makes the user put in a string and it reverses it.
 *
 * @author Tameyah Galindez
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a String: ");
        String s = input.nextLine();
        System.out.printf(" The Reversed string is %s ",
                (new StringBuffer(s).reverse().toString()));

    }

}
