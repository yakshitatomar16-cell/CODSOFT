package Task1.NumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing game!");
        System.out.println("You have to guess a number between 1 and 100.");

        while (playAgain) {

            int target = rand.nextInt(100) + 1;
            int attempts = 7;
            boolean guessed = false;

            System.out.println("\nNew round started! You have " + attempts + " attempts.");

            while(attempts > 0) {
                System.out.println("Enter your guess: ");

                while(!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number: ");
                    sc.next();
                }

                int guess = sc.nextInt();

                if(guess == target) {
                    System.out.println("Correct! You guessed the number.");
                    guessed = true;
                    score++;
                    break;
                } else if(guess > target) {
                    System.out.println("Too high.");
                } else {
                    System.out.println("Too low.");
                }

                attempts--;
                if(attempts > 0) {
                    System.out.println("Attempts left: " + attempts);
                }
            }

            if(!guessed) {
                System.out.println("You can ran out of attempts. The number was:  " + target);
            }

            System.out.println("Your current score: " + score);

            System.out.println("Do you want to play again? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            playAgain = response.startsWith("y");
        }

        System.out.println("Thanks for playing! Final score: " + score);
        sc.close();
    }




}


