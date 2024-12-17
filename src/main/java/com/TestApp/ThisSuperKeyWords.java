package com.TestApp;

class Parent {
    // Parent class fields
    String parentName = "Parent Class Name";

    // Parent class constructor
    public Parent() {
        System.out.println("Parent class constructor called.");
    }
}

public class ThisSuperKeyWords extends Parent {

    // Instance fields
    String currentClassName = "ThisSuperKeyWords Class Name";

    // Constructor of the current class
    public ThisSuperKeyWords() {
        // Call constructor of the parent class using super()
        super();
        System.out.println("ThisSuperKeyWords class constructor called.");
    }

    // Constructor of the current class with arguments
    public ThisSuperKeyWords(String currentClassName) {
        // Call the constructor of the current class using this()
        this();
        this.currentClassName = currentClassName;
        System.out.println("Constructor with argument in ThisSuperKeyWords called.");
    }

    // Method to print fields using this (instance members of the current class)
    public void printThisFields() {
        System.out.println("Printing current class fields using this:");
        System.out.println("Current Class Field (this.currentClassName): " + this.currentClassName);
    }

    // Method to print fields of the parent class using super
    public void printSuperFields() {
        System.out.println("Printing parent class fields using super:");
        System.out.println("Parent Class Field (super.parentName): " + super.parentName);
    }
    public static void main(String[] args) {
        // Create an object of the current class
        ThisSuperKeyWords obj = new ThisSuperKeyWords();

        // Print the fields of the current class using this
        obj.printThisFields();
        // Print the fields of the parent class using super
        obj.printSuperFields();
    }
}
