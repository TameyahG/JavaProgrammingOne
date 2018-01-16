package Chapter4;

import java.util.Scanner;

/**
 * Information of the bidders and how much they will pay. Following with who
 * wins whatever they bid on.
 *
 * @author Tameyah Galindez
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" What is the name of the first bidder? ");
        String name1 = input.next();

        System.out.println(" How many work hours will the first bidder require? ");
        int hour1 = input.nextInt();

        System.out.println(" How much does the first bidder charge per hour? ");
        double charge1 = input.nextDouble();

        System.out.println(" What is the name of the second bidder? ");
        String name2 = input.next();

        System.out.println(" How many work hours will the second bidder require? ");
        int hour2 = input.nextInt();

        System.out.println(" How much does the second bidder charge per hour? ");
        double charge2 = input.nextDouble();

        double cost1 = (hour1 * charge1);
        double cost2 = (hour2 * charge2);

        if (cost1 < cost2) {
            System.out.printf(" The winner is %s with a price of %.2f", name1, cost1);
        } else if (cost2 < cost1) {
            System.out.printf(" The winner is %s with a price of %.2f", name2, cost2);
        } else if ((cost1 == cost2) && (hour1 < hour2)) {
            System.out.printf(" The winner is %s with a time alotment of %d", name1, hour1);
        } else if ((cost1 == cost2) && (hour2 > hour1)) {
            System.out.printf(" The winner is %s with a time alotment of %d", name2, hour2);
        } else {
            System.out.printf(" Both bidders have identical bids, %d, %.2f, %.2f", hour1, charge1, cost1);
        }
    }

}
