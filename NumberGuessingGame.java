import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // generate a random number
        int randomNumber = rand.nextInt(100) + 1;

        // keep track of and limit the number of attempts
        int attempts = 0;
        int maxAttempts = 5;

        // prompt user to take a guess
        while(true) {
            System.out.println("Enter your guess between 1-100: ");

            // get user input
            int userGuess = scanner.nextInt();
            attempts++;

            // check to see if the user guessed correctly
            if (userGuess == randomNumber) {
                System.out.println("Correct! You won the game!");
                System.out.println("Number of Attempts: " + attempts);
                break;
            }
            else if (randomNumber > userGuess) {
                System.out.println("Incorrect, the number is higher. Please guess again: ");
            }
            else {
                System.out.println("Incorrect, the number is lower. Please guess again: ");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attemps. Game over.");
                break;
            }
        }

        scanner.close();
    }
}