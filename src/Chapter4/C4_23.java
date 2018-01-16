package Chapter4;

import java.util.Scanner;

/**
 * A person's work, and hours they have or will do. With right amount of pay for
 * then, resulting with Pay rate and Federal and state holdings.
 *
 * @author Tameyah Galindez
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federaltax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double statetax = input.nextDouble();

        System.out.printf("\nEmployee's name: %4s", name);
        System.out.printf("\nHours worked: %.2f", hours);
        System.out.printf("\nPay rate: $%.2f", rate);
        System.out.printf("\nGross pay: $%.2f", rate * hours);
        System.out.printf("\nDeductions: ");
        System.out.printf("\nFederal withholding: $%.2f", rate * federaltax * hours + (federaltax * 100));
        System.out.printf("\nState withholding: $%.2f", federaltax * rate * hours + (statetax * 100));
        System.out.printf("\nTotal deduction: $%.2f", hours * (federaltax + statetax) * rate);
        System.out.printf("\nNet Pay: $%.2f", (1 - statetax - federaltax) * rate * hours);
    }
}
