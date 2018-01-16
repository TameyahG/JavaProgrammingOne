package Chapter2;

import java.util.Scanner;

/**
 * This code, helps find the Volume and Area of a Cylinder
 *
 * @author Tameyah Galindez
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        double length = input.nextDouble();
        double volume = area * length;
        System.out.println(" Volume is " + volume + " Area is " + area);
    }
}
