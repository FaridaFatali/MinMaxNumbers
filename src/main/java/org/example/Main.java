package org.example;

import java.util.Scanner;

/**
 * Exercise: <a href="https://www.youtube.com/watch?v=uS1V0jsn5jg&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=26">...</a>
 * @author Farida Fatali
 */

// Finding the minimum and the maximum values among the numbers entered by the user

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();

        int min = 0;
        int max = 0;
        int number;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the " + i + ". number: ");
            number = scanner.nextInt();
            if (number < min || min == 0) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The minimum number: " + min);
        System.out.println("The maximum number: " + max);
    }
}