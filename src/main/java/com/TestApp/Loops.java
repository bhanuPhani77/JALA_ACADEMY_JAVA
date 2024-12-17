package com.TestApp;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // 1. Print "Bright IT Career" ten times using for loop
        System.out.println("Task 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bright IT Career");
        }
        // 2. Print numbers from 1 to 20 using while loop
        System.out.println("\nTask 2:");
        int num = 1;
        while (num <= 20) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        // 3. Equal and Not Equal Operators
        System.out.println("\nTask 3:");
        int a = 10, b = 20;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // 4. Print odd and even numbers
        System.out.println("\nTask 4:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

        // 5. Largest among three numbers
        System.out.println("\nTask 5:");
        int x = 25, y = 50, z = 15;
        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Largest among " + x + ", " + y + ", " + z + " is: " + largest);

        // 6. Print even numbers between 10 and 100 using while loop
        System.out.println("\nTask 6:");
        int even = 10;
        while (even <= 100) {
            System.out.print(even + " ");
            even += 2;
        }
        System.out.println();

        // 7. Print numbers 1 to 10 using do-while loop
        System.out.println("\nTask 7:");
        int doWhileNum = 1;
        do {
            System.out.print(doWhileNum + " ");
            doWhileNum++;
        } while (doWhileNum <= 10);
        System.out.println();

        // 8. Find if a number is an Armstrong number
        System.out.println("\nTask 8:");
        int armstrongNum = 153; // Example number
        int original = armstrongNum, sum = 0;
        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }
        System.out.println(armstrongNum + " is " + (sum == armstrongNum ? "an Armstrong number." : "not an Armstrong number."));

        // 9. Find if a number is prime
        System.out.println("\nTask 9:");
        int primeNum = 29; // Example number
        boolean isPrime = true;
        if (primeNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primeNum); i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(primeNum + " is " + (isPrime ? "a prime number." : "not a prime number."));

        // 10. Check if a number is palindrome
        System.out.println("\nTask 10:");
        int palindromeNum = 121; // Example number
        original = palindromeNum;
        int reversed = 0;
        while (original != 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }
        System.out.println(palindromeNum + " is " + (reversed == palindromeNum ? "a palindrome." : "not a palindrome."));

        // 11. Check if a number is even or odd using switch
        System.out.println("\nTask 11:");
        int switchNum = 7; // Example number
        switch (switchNum % 2) {
            case 0:
                System.out.println(switchNum + " is EVEN.");
                break;
            case 1:
                System.out.println(switchNum + " is ODD.");
                break;
        }

        // 12. Print gender (Male/Female) program using switch
        System.out.println("\nTask 12:");
        char gender = 'M'; // Example input
        switch (gender) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input for gender.");
        }

        // 13. Multiple if-else statement to find largest among 10, 20, 30
        System.out.println("\nTask 13:");
        int p = 10, q = 20, r = 30;
        if (p > q && p > r) {
            System.out.println("Largest number is: " + p);
        } else if (q > r) {
            System.out.println("Largest number is: " + q);
        } else {
            System.out.println("Largest number is: " + r);
        }
    }
}

