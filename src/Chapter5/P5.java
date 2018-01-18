package Chapter5;

import java.util.Scanner;

/**
 * Program to count the number of votes
 *
 * @author Tameyah Galindez
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;
        int noes = 0, yeses = 0;
        for (in = getString(input); !in.equals("q"); in = getString(input)) {
            if (in.equals("y")) {
                yeses++;
            } else if (in.equals("n")) {
                noes++;
            } else {
                System.out.print("INVALID CODE: ");
            }
        }
        System.out.printf("Total voting:%n"
                + "Number of NO votes: %d%n"
                + "Number of YES votes: %d%n", noes, yeses);
    }

    /**
     * Method to print
     *
     * @param in The user enters the input
     * @return The in, by user 
     */
    public static String getString(Scanner in) {
        System.out.print("Enter â€˜Yâ€™ to vote yes, â€˜Nâ€™ to vote no, or â€˜Qâ€™ to quit voting: ");
        return in.next().toLowerCase();
    }
}
