package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber = (int)(Math.random()*5)+1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 to 5.");

        for (int i = 0; i < 3; i++) {
            System.out.print("Guess " + i + ": ");
            int guess = scanner.nextInt();
            if (secretNumber == guess) {
                System.out.println("You guessed it! \nYou win!");
                break;
            } else {
                if (i == 2) {
                    System.out.println("You lose. The correct number was " + secretNumber + ".");
                } else {
                    System.out.println("Wrong guess.");
                }
            }
        }
    }
}