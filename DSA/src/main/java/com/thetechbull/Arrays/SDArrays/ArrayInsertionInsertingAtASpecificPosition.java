package com.thetechbull.Arrays.SDArrays;

public class ArrayInsertionInsertingAtASpecificPosition {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Original array
        int newElement = 25;                 // Element to insert
        int position = 2;                    // Insert at index 2

        // Create a new array with size +1
        int[] newArray = new int[numbers.length + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = numbers[i];
        }

        // Insert the new element
        newArray[position] = newElement;

        // Copy the remaining elements
        for (int i = position; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        // Print the new array
        System.out.println("Array after insertion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
