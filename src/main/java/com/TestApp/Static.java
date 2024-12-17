package com.TestApp;

public class Static {

    // Static variables
    static int staticVar1 = 100;
    static String staticVar2 = "Static Variable";

    // Instance variables
    int instanceVar1 = 200;
    String instanceVar2 = "Instance Variable";

    // Static method 1
    static void staticMethod1() {
        System.out.println("Inside staticMethod1.");
        // Access instance variables using an object
        Static obj = new Static();
        System.out.println("Accessing instanceVar1 in staticMethod1: " + obj.instanceVar1);
        System.out.println("Accessing instanceVar2 in staticMethod1: " + obj.instanceVar2);

        // Call instance method from static method
        obj.instanceMethod1();
    }

    // Static method 2
    static void staticMethod2() {
        System.out.println("Inside staticMethod2.");
    }

    // Instance method 1
    void instanceMethod1() {
        System.out.println("Inside instanceMethod1.");
        // Access static variables directly
        System.out.println("Accessing staticVar1 in instanceMethod1: " + staticVar1);
        System.out.println("Accessing staticVar2 in instanceMethod1: " + staticVar2);

        // Call static method from instance method
        staticMethod2();
    }

    // Instance method 2
    void instanceMethod2() {
        System.out.println("Inside instanceMethod2.");
    }
    // Main method
    public static void main(String[] args) {
        // Task 6: Print all static and instance variables
        System.out.println("Static Variables:");
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);

        Static obj = new Static(); // Create an object to access instance variables
        System.out.println("Instance Variables:");
        System.out.println("instanceVar1: " + obj.instanceVar1);
        System.out.println("instanceVar2: " + obj.instanceVar2);

        // Task 7: Call static and instance methods
        System.out.println("\nCalling Static Methods:");
        staticMethod1();
        staticMethod2();

        System.out.println("\nCalling Instance Methods:");
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

