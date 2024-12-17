package com.TestApp;

abstract class Abstract {

    // Abstract method (Task 1)
    abstract void abstractMethod();

    // Non-abstract method (Task 1)
    public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method from the abstract class.");
    }

    public static void main(String[] args) {
        // Task 2: Create an object of the child class and call non-abstract methods of the abstract class
        ChildClass childObject = new ChildClass();
        childObject.nonAbstractMethod();

        // Task 3: Create an instance of the child class in the child class itself and call abstract methods
        ChildClass anotherChildObject = new ChildClass();
        anotherChildObject.abstractMethod();

        // Task 4: Create an instance of the child class in the child class itself and call non-abstract methods
        anotherChildObject.nonAbstractMethod();
    }
}

// Subclass for the abstract class (Task 2, 3, 4)
class ChildClass extends Abstract {

    // Implementation of the abstract method (Task 3)
    @Override
    void abstractMethod() {
        System.out.println("This is the implementation of the abstract method in the child class.");
    }

}

