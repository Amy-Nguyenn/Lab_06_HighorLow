import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        // generate a random number between 1 and 10
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean validInput = false;

        // prompt user to guess the number
        do {
            System.out.print("Guess the number (1 to 10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();  //
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a number between 1 and 10.");
            }
        } while (!validInput);

        // display the random number and check the guess
        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess was too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("You're on the money!");
        }
    }
}