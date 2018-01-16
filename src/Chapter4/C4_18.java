package Chapter4;

import java.util.Scanner;

/**
 * A code to see what class and grade you were in, and if you put a 'Higher
 * number ' that what was given, was deemed Invalid.
 *
 * @author Tameyah Galindez
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Major and status: ");
        System.out.println(" M = Mathematics ");
        System.out.println(" C = ComputerScience ");
        System.out.println(" I = InformationTechnology ");
        System.out.println(" 1 = Freshman ");
        System.out.println(" 2 = Sophomore ");
        System.out.println(" 3 = Junior ");
        System.out.println(" 4 = Senior ");
        String major = input.next();
        char x = major.charAt(0);
        char y = major.charAt(1);
        if ((x != 'M' && x != 'I' && x != 'C') || (y != '1' && y != '2' && y != '3' && y != '4')) {
            System.out.println(" Invalid ");
            System.exit(0);
        }

        if (x == 'M') {
            System.out.print(" Mathematics ");
        } else if (x == 'I') {
            System.out.print(" InformationTechnology");
        } else if (x == 'C') {
            System.out.print(" Computer Science");
        }

        if (y == '1') {
            System.out.print(" Freshman ");
        } else if (y == '2') {
            System.out.print(" Sophomore ");
        } else if (y == '3') {
            System.out.print(" Junior ");
        } else if (y == '4') {
            System.out.print(" Senior ");
        }
    }
}
