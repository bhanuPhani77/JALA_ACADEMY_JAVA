package com.TestApp;

public class Strings {

    public static void main(String[] args) {
        // Task 1: Different ways of creating a string
        String str1 = "Hello";
        String str2 = new String("World");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println("Task 1:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        // Task 2: Concatenating two strings using + operator
        String concatStr = str1 + " " + str2;
        System.out.println("\nTask 2:");
        System.out.println("Concatenated String: " + concatStr);

        // Task 3: Finding the length of the string
        System.out.println("\nTask 3:");
        System.out.println("Length of String 1: " + str1.length());

        // Task 4: Extract a string using Substring
        System.out.println("\nTask 4:");
        System.out.println("Substring of String 1: " + str1.substring(1, 4)); // "ell"

        // Task 5: Searching in strings using indexOf()
        System.out.println("\nTask 5:");
        System.out.println("Index of 'l' in String 1: " + str1.indexOf('l'));
        System.out.println("Index of 'lo' in String 1: " + str1.indexOf("lo"));

        // Task 6: Matching a String Against a Regular Expression With matches()
        String pattern = "\\w+";
        System.out.println("\nTask 6:");
        System.out.println("Does String 1 match the pattern \\w+: " + str1.matches(pattern));

        // Task 7: Comparing strings using equals()
        System.out.println("\nTask 7:");
        System.out.println("String 1 equals String 3: " + str1.equals(str3)); // true
        System.out.println("String 1 equals String 2: " + str1.equals(str2)); // false

        // Task 8: equalsIgnoreCase(), startsWith(), endsWith(), and compareTo()
        String str4 = "hello";
        System.out.println("\nTask 8:");
        System.out.println("String 1 equalsIgnoreCase String 4: " + str1.equalsIgnoreCase(str4)); // true
        System.out.println("String 1 startsWith 'He': " + str1.startsWith("He")); // true
        System.out.println("String 1 endsWith 'lo': " + str1.endsWith("lo")); // true
        System.out.println("String 1 compareTo String 2: " + str1.compareTo(str2)); // Negative (lexicographical order)

        // Task 9: Trimming strings with trim()
        String str5 = "   Hello World   ";
        System.out.println("\nTask 9:");
        System.out.println("Before trim: '" + str5 + "'");
        System.out.println("After trim: '" + str5.trim() + "'");

        // Task 10: Replacing characters in strings with replace()
        System.out.println("\nTask 10:");
        System.out.println("Replacing 'l' with 'x' in String 1: " + str1.replace('l', 'x'));

        // Task 11: Splitting strings with split()
        String str6 = "Hello,World,Java";
        System.out.println("\nTask 11:");
        String[] parts = str6.split(",");
        for (String part : parts) {
            System.out.println("Split part: " + part);
        }

        // Task 12: Converting Numbers to Strings with valueOf()
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("\nTask 12:");
        System.out.println("Number as String: " + numStr);

        // Task 13: Converting integer objects to Strings
        Integer integer = 456;
        String integerStr = integer.toString();
        System.out.println("\nTask 13:");
        System.out.println("Integer object as String: " + integerStr);

        // Task 14: Converting to uppercase and lowercase
        System.out.println("\nTask 14:");
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());
        System.out.println("String 1 in lowercase: " + str1.toLowerCase());
    }
}

