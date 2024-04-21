import java.util.Random;
import java.util.Scanner;

public class ProjectGuessTheNumber {
    public static void main(String[] args) {
        int guessCount = 0;
        int guess;
        int correctNumber;

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        correctNumber = random.nextInt(100) + 1; // number between 1 and 100, inclusive.

        do {
            System.out.print("Guess a number: ");
            guess = keyboard.nextInt();
            guessCount++;

            if (guess == correctNumber) {
                System.out.printf("Congratulations! You guessed the number in %d guesses! Thanks for playing!", guessCount);
            }
            else if (guess < 1 || guess > 100 ) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive.");
            }
            else if (guess > correctNumber) {
                System.out.println("Your guess was too high.");
            }
            else {
                // guess < correctNumber
                System.out.println("Your guess was too low");
            }
        } while (guess != correctNumber);

    }
}
