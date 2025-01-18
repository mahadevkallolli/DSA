package com.thetechbull.Arrays.SDArrays;

public class ArrayElementDeletion {
    public static void main(String[] args) {

        int[] originalArray={1,2,3,4,5,6};
        // Index of the element to be deleted (4)
        int deleteIndex=3;

        System.out.println("Array elements before delete");
        for (int num:originalArray){
            System.out.println(num+" ");
        }
        // Deleting the element by shifting elements
        for (int i=deleteIndex;i<originalArray.length-1;i++){
            // Shift elements to the left
            originalArray[i]=originalArray[i + 1];
        }
        // Optionally create a new array with size reduced by 1
        int[] newArray = new int[originalArray.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        System.out.println("\nArray after deletion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
