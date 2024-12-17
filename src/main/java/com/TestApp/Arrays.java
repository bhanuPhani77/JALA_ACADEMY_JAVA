package com.TestApp;

import java.util.HashSet;
import java.util.Set;

public class Arrays {

    public static void main(String[] args) {
        int[] array = {12, 23, 12, 45, 67, 89, 23, 45, 90};
        int[] array2 = {23, 45, 56, 78};

        System.out.println("1. Sum of array: " + sumArray(array));
        System.out.println("2. Average value of array: " + averageArray(array));
        System.out.println("3. Index of element 45: " + findIndex(array, 45));
        System.out.println("4. Array contains 67: " + containsValue(array, 67));
        System.out.println("5. Array after removing 23: " + java.util.Arrays.toString(removeElement(array, 23)));
        System.out.println("6. Copied array: " + java.util.Arrays.toString(copyArray(array)));
        System.out.println("7. Array after inserting 99 at position 3: " + java.util.Arrays.toString(insertElement(array, 99, 3)));
        System.out.println("8. Min and Max: " + java.util.Arrays.toString(findMinMax(array)));
        System.out.println("9. Reversed array: " + java.util.Arrays.toString(reverseArray(array)));
        System.out.println("10. Duplicate values: " + findDuplicates(array));
        System.out.println("11. Common values: " + findCommonValues(array, array2));
        System.out.println("12. Array without duplicates: " + java.util.Arrays.toString(removeDuplicates(array)));
        System.out.println("13. Second largest number: " + findSecondLargest(array));
        System.out.println("15. Count of even and odd numbers: " + java.util.Arrays.toString(countEvenOdd(array)));
        System.out.println("16. Difference between largest and smallest: " + differenceMaxMin(array));
        System.out.println("17. Contains 12 and 23: " + containsTwoValues(array, 12, 23));
    }

    // 1. Function to add integer values of an array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum;
    }

    // 2. Function to calculate average value of an array
    public static double averageArray(int[] array) {
        return (double) sumArray(array) / array.length;
    }

    // 3. Program to find the index of an array element
    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1; // Value not found
    }

    // 4. Function to test if array contains a specific value
    public static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) return true;
        }
        return false;
    }

    // 5. Function to remove a specific element from an array
    public static int[] removeElement(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num != value) count++;
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num != value) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }

    // 6. Function to copy an array to another array
    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // 7. Function to insert an element at a specific position in the array
    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = element;
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    // 8. Function to find the minimum and maximum value of an array
    public static int[] findMinMax(int[] array) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    // 9. Function to reverse an array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // 10. Function to find duplicate values of an array
    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : array) {
            if (!seen.add(num)) duplicates.add(num);
        }
        return duplicates;
    }

    // 11. Program to find the common values between two arrays
    public static Set<Integer> findCommonValues(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for (int num : array1) set1.add(num);
        for (int num : array2) {
            if (set1.contains(num)) common.add(num);
        }
        return common;
    }

    // 12. Method to remove duplicate elements from an array
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> unique = new HashSet<>();
        for (int num : array) {
            unique.add(num);
        }
        int[] result = new int[unique.size()];
        int i = 0;
        for (int num : unique) {
            result[i++] = num;
        }
        return result;
    }

    // 13. Method to find the second largest number in an array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    // 15. Method to count even and odd numbers in an array
    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        return new int[]{evenCount, oddCount};
    }

    // 16. Function to get the difference between largest and smallest value
    public static int differenceMaxMin(int[] array) {
        int[] minMax = findMinMax(array);
        return minMax[1] - minMax[0];
    }

    // 17. Method to verify if the array contains two specified elements
    public static boolean containsTwoValues(int[] array, int value1, int value2) {
        return containsValue(array, value1) && containsValue(array, value2);
    }
}

