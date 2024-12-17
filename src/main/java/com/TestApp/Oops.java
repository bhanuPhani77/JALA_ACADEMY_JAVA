package com.TestApp;

public class Oops {
    // Global variable
    String name = "Global Star";

    public static void main(String[] args) {
        // Task 2: Print your name
        System.out.println("Task 2: My name is Bhanu Phaneendra");

        // Task 3: Single-line, multi-line, and documentation comments
        // This is a single-line comment

        /*
         * This is a multi-line comment
         * that spans across multiple lines.
         */

        /**
         * This is a documentation comment.
         * It provides documentation for methods or classes.
         */

        // Task 4: Define variables of different data types and print them
        int myInt = 10;
        boolean myBool = true;
        char myChar = 'A';
        float myFloat = 10.5f;
        double myDouble = 20.99;
        System.out.println("Task 4:");
        System.out.println("int: " + myInt);
        System.out.println("boolean: " + myBool);
        System.out.println("char: " + myChar);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);

        // Task 5: Define local and global variables with the same name and print them
        String name = "Local Name";
        System.out.println("Task 5:");
        System.out.println("Local Variable: " + name);
        System.out.println("Global Variable: " + new Oops().name);

        // Task 6: Call a function to print your name
        printName();

        // Task 1: Class, Object, Method, and Method Signature
        System.out.println("Task 1:");
        MyClass obj = new MyClass(); // Object creation
        obj.myMethod(); // Method call
    }

    // Task 6: Function to print your name
    public static void printName() {
        System.out.println("Task 6: My name is Bhanu Phaneendra (printed using a function).");
    }
}
class MyClass {
    // Method signature: public void myMethod()
    public void myMethod() {
        System.out.println("This is a method from another class.");
    }
}
