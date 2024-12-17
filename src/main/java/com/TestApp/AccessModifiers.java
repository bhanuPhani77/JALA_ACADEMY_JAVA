package com.TestApp;



public class AccessModifiers {

    // Task 1: Private fields and method
    private String privateField = "Private Field";

    private void privateMethod() {
        System.out.println("Private Method Called");
    }

    // Task 2: Default fields and methods
    String defaultField = "Default Field"; // default (package-private)

    void defaultMethod() {
        System.out.println("Default Method Called");
    }

    // Task 3: Protected fields and methods
    protected String protectedField = "Protected Field";

    protected void protectedMethod() {
        System.out.println("Protected Method Called");
    }

    // Task 4: Public fields and methods
    public String publicField = "Public Field";

    public void publicMethod() {
        System.out.println("Public Method Called");
    }

    public static void main(String[] args) {
        // Accessing private fields and methods within the same class
        AccessModifiers am = new AccessModifiers();
        System.out.println("Accessing Private Field: " + am.privateField);
        am.privateMethod();

        // Accessing default fields and methods within the same class
        System.out.println("Accessing Default Field: " + am.defaultField);
        am.defaultMethod();

        // Accessing protected fields and methods within the same class
        System.out.println("Accessing Protected Field: " + am.protectedField);
        am.protectedMethod();

        // Accessing public fields and methods within the same class
        System.out.println("Accessing Public Field: " + am.publicField);
        am.publicMethod();
    }
}

// Subclass to demonstrate access to private, default, protected, and public fields/methods
class SubClass extends AccessModifiers {
    public void demonstrateAccess() {
        // Private fields/methods are not accessible in subclass
        // System.out.println(privateField); // Compilation Error
        // privateMethod();                 // Compilation Error

        // Access default fields/methods (accessible only within the same package)
        System.out.println("Accessing Default Field: " + defaultField);
        defaultMethod();

        // Access protected fields/methods (accessible within subclass, even in a different package)
        System.out.println("Accessing Protected Field: " + protectedField);
        protectedMethod();

        // Access public fields/methods (accessible everywhere)
        System.out.println("Accessing Public Field: " + publicField);
        publicMethod();
    }
}

// Additional class in the same package to demonstrate access to default and protected fields/methods
class SamePackageClass {
    public void demonstrateAccess() {
        AccessModifiers am = new AccessModifiers();

        // Default fields/methods (accessible within the same package)
        System.out.println("Accessing Default Field: " + am.defaultField);
        am.defaultMethod();

        // Protected fields/methods (accessible within the same package)
        System.out.println("Accessing Protected Field: " + am.protectedField);
        am.protectedMethod();

        // Public fields/methods (accessible everywhere)
        System.out.println("Accessing Public Field: " + am.publicField);
        am.publicMethod();
    }
}

