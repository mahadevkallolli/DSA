package com.thetechbull.Arrays.SDArrays;

public class ArrayInsertionInsertingAtASpecificPosition2 {

    public static void main(String[] args) {
        int[] originalArray={10,40,60,80};//size of the original array is 4
        int newElement=70;//element I want insert at
        int position=4;//position 3

        //System.out.println("Array before size increased :"+originalArray.length);
        //crating new array to increase the size to +1
        int[] newArray= new int[originalArray.length+1];

       // System.out.println("New array is : "+newArray.length);

        //copy the elements before the position
        for (int i=0;i<position;i++){
            newArray[i] =originalArray[i];
        }
        //insert new element to new array
        newArray[position]=newElement;

        //copy remaining elements to new array
        for (int i=position;i<originalArray.length;i++){
            newArray[i + 1] =originalArray[i];
        }

        System.out.println("Array After inserting new element");
        for (int num: newArray){
            System.out.println(num+" ");
        }
    }
}
