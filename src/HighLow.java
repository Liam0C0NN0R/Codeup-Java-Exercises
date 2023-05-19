//TODO The specs for the game are:
// Game picks a random number between 1 and 100.
// Prompts user to guess the number.
// All user inputs are validated.
// If user's guess is less than the number, it outputs "HIGHER".
// If user's guess is more than the number, it outputs "LOWER".
// If a user guesses the number, the game should declare "GOOD GUESS!"
// Hints: Use the random method of the java.lang.Math class to generate a random number.
// Bonus: Keep track of how many guesses a user makes. Set an upper limit on the number of guesses.
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess;
        boolean guessedCorrectly = false;
        int numGuesses = 0;
        int maxGuesses = 10;

        System.out.println("Welcome to the Number Guessing Game!");

        while (numGuesses < maxGuesses && !guessedCorrectly) {
            System.out.print("Guess a number between 1 and 100: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Guess again: ");
                scanner.next();
            }
            userGuess = scanner.nextInt();

            numGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                guessedCorrectly = true;
                System.out.println("GOOD GUESS!");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Out of guesses! The number was: " + randomNumber);
        } else {
            System.out.println("Total guesses: " + numGuesses);
        }

        scanner.close();
    }
}

