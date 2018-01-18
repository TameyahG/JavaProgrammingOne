package Chapter5;

import java.util.Scanner;

/**
 * This program uses switches and breaks in order to make Rock, Paper, and Scissors
 *
 * @author Tameyah Galindez
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        // Declare the variables to be used        
        int computer, player;
        int playerCount = 0, computerCount = 0;
        Scanner input = new Scanner(System.in);

        // Loop logic
        do {
            System.out.print("scissor (0), rock (1), paper (2): ");
            player = input.nextInt();
            computer = (int) (Math.random() * 3);

            switch (player) {
                case 0: // scissor for player
                    if (computer == 0) { // scissor(player) VS scissor(computer)
                        System.out.println("TIE");
                    } else if (computer == 1) { // scissor(player) VS rock(computer)
                        System.out.println("You lose");
                        ++computerCount;
                    } else if (computer == 2) { // scissor(player) VS paper(computer)
                        System.out.println("You win");
                        ++playerCount;
                    }
                    break;
                case 1: // rock for player
                    if (computer == 0) { // rock(player) VS scissor(computer)
                        System.out.println("You win");
                        ++playerCount;
                    } else if (computer == 1) { // rock(player) VS rock(computer)
                        System.out.println("TIE");
                    } else if (computer == 2) { // rock(player) VS paper(computer)
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    break;
                case 3: // paper for player
                    if (computer == 0) { // paper(player) VS scissor(computer)
                        System.out.println("You lose");
                        ++computerCount;
                    } else if (computer == 1) { // paper(player) VS rock(computer)
                        System.out.println("You win");
                        ++playerCount;
                    } else if (computer == 2) { // paper(player) VS paper(computer)
                        System.out.println("TIE");
                    }
                    break;

            }
        } while (playerCount <= 2 && computerCount <= 2);

    }

}
