package com.TestApp;

public class Operators {

    public static void main(String[] args) {
        Operators operators = new Operators(); // Create an object to call instance methods

        // Task 1: Arithmetic operators
        System.out.println("Task 1: Arithmetic Operators");
        operators.arithmeticOperations(10, 5);

        // Task 2: Increment and Decrement operators
        System.out.println("\nTask 2: Increment and Decrement Operators");
        operators.incrementDecrementOperators(5);

        // Task 3: Equal and Not Equal operators
        System.out.println("\nTask 3: Equal and Not Equal Operators");
        operators.equalNotEqual(10, 20);

        // Task 4: Check if two numbers are equal
        System.out.println("\nTask 4: Check if Two Numbers Are Equal");
        operators.checkEquality(15, 15);

        // Task 5: Logical AND, OR, and NOT
        System.out.println("\nTask 5: Logical Operators");
        operators.logicalOperators(true, false);

        // Task 6: Relational operators
        System.out.println("\nTask 6: Relational Operators");
        operators.relationalOperators(10, 20);

        // Task 7: Print the smaller and larger numbers
        System.out.println("\nTask 7: Smaller and Larger Numbers");
        operators.printSmallerAndLarger(50, 25);
    }

    // Task 1: Arithmetic Operators
    public void arithmeticOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // Task 2: Increment and Decrement Operators
    public void incrementDecrementOperators(int value) {
        System.out.println("Initial Value: " + value);
        System.out.println("Post-Increment: " + (value++));
        System.out.println("After Post-Increment: " + value);
        System.out.println("Pre-Increment: " + (++value));
        System.out.println("Post-Decrement: " + (value--));
        System.out.println("After Post-Decrement: " + value);
        System.out.println("Pre-Decrement: " + (--value));
    }

    // Task 3: Equal and Not Equal Operators
    public void equalNotEqual(int a, int b) {
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));
    }

    // Task 4: Check if Two Numbers Are Equal
    public void checkEquality(int a, int b) {
        if (a == b) {
            System.out.println(a + " and " + b + " are equal.");
        } else {
            System.out.println(a + " and " + b + " are not equal.");
        }
    }

    // Task 5: Logical Operators
    public void logicalOperators(boolean x, boolean y) {
        System.out.println(x + " && " + y + ": " + (x && y)); // Logical AND
        System.out.println(x + " || " + y + ": " + (x || y)); // Logical OR
        System.out.println("! " + x + ": " + (!x));          // Logical NOT
    }

    // Task 6: Relational Operators
    public void relationalOperators(int a, int b) {
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " <= " + b + ": " + (a <= b));
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
    }

    // Task 7: Print the Smaller and Larger Numbers
    public void printSmallerAndLarger(int a, int b) {
        if (a > b) {
            System.out.println("Smaller Number: " + b);
            System.out.println("Larger Number: " + a);
        } else if (b > a) {
            System.out.println("Smaller Number: " + a);
            System.out.println("Larger Number: " + b);
        } else {
            System.out.println("Both numbers are equal: " + a);
        }

    }
}
