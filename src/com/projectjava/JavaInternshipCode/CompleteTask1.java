    package com.projectjava.JavaInternshipCode;

import java.util.*;
public class CompleteTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;
        do {
            int rand_Number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int guess;

            System.out.println("\nI'm thinking of a number between 1 and 100. Can you guess it?");

            while (true) {
                System.out.print("Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    scanner.next();
                    continue;
                }

                guess = scanner.nextInt();
                attempts++;

                if (guess < rand_Number) {
                    System.out.println("Too low! Try again.");
                } else if (guess > rand_Number) {
                    System.out.println("Too high! Try again.");
                    } else {
                    System.out.println("You guessed it in " + attempts + " attempts.");
                    break;
                }
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // clear the buffer
            playAgain = scanner.nextLine().trim().toLowerCase();

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("👋 Thanks for playing! Goodbye.");
        scanner.close();
    }
}


