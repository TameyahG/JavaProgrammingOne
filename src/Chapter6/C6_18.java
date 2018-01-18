package Chapter6;

import java.util.Scanner;

/**
 *
 *This programs sees if a password is either, Invalid or Valid to the key points that it asks.
 * @author Tameyah Galindez
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter A Password: ");
        String password = input.next();
        if (isValid(password) == true) {
            System.out.print(" Valid ");
        } else {
            System.out.print(" Invalid ");
        }
    }
//Sees if it is the right length
    public static boolean isValid(String password) {
        //8 characters
        if (password.length() < 8) {
            return false;
        }

        //only characters and digits
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        //atleast 2 digits
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        }

        return true;

    }

}
