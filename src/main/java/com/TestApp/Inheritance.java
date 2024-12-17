package com.TestApp;

public class Inheritance {

    public static void main(String[] args) {
        // Create objects for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Calling methods using their own objects:");
        // Call methods of class A
        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();

        // Call methods of class B
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod();

        // Call methods of class C
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod();

        System.out.println("\nCalling overridden method using superclass reference:");
        A refToB = new B();
        A refToC = new C();

        refToB.overrideMethod(); // Calls B's overrideMethod
        refToC.overrideMethod(); // Calls C's overrideMethod

        System.out.println("\nDemonstrating runtime polymorphism with data members:");
        System.out.println("Superclass reference to B: " + refToB.data);
        System.out.println("Superclass reference to C: " + refToC.data);
    }
}

// Superclass A
class A {
    int data = 10;

    void methodA1() {
        System.out.println("Method A1: Specific to Class A");
    }

    void methodA2() {
        System.out.println("Method A2: Specific to Class A");
    }

    void overrideMethod() {
        System.out.println("Override Method in Class A");
    }
}

// Subclass B
class B extends A {
    int data = 20;

    void methodB1() {
        System.out.println("Method B1: Specific to Class B");
    }

    void methodB2() {
        System.out.println("Method B2: Specific to Class B");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class B");
    }
}

// Subclass C
class C extends B {
    int data = 30;

    void methodC1() {
        System.out.println("Method C1: Specific to Class C");
    }

    void methodC2() {
        System.out.println("Method C2: Specific to Class C");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class C");
    }
}

