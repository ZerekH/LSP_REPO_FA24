package org.howard.edu.lsp.finalexam.question2;

import java.util.Scanner;

/**
 * Client program to demonstrate the RandomNumberService with runtime method selection.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService randomNumberService = RandomNumberService.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Random Number Generation Method:");
        System.out.println("1. Java Random Generator");
        System.out.println("2. Custom Random Generator");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        try {
            if (choice == 1) {
                randomNumberService.setMethod("JAVA_RANDOM");
            } else if (choice == 2) {
                randomNumberService.setMethod("CUSTOM_RANDOM");
            } else {
                System.out.println("Invalid choice. Defaulting to Java Random Generator.");
                randomNumberService.setMethod("JAVA_RANDOM");
            }

            int randomNumber = randomNumberService.generateRandomNumber();
            System.out.println("Generated Random Number: " + randomNumber);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
