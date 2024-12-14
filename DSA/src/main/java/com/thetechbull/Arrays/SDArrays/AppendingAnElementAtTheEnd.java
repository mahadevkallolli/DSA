package com.thetechbull.Arrays.SDArrays;

public class AppendingAnElementAtTheEnd {

    public static void main(String[] args) {
        int[] initialArray={100,200,300,400,600,900};
        int newElement=1000;


        //create new array
        int[] newArray=new int[initialArray.length+1];

        //copy all elements in new array
        for (int i=0;i<initialArray.length;i++){
            newArray[i]=initialArray[i];
        }
        //append the new element
        newArray[initialArray.length]=newElement;


        for (int num : newArray){
            System.out.println(num+" ");
        }
        //System.out.println(newArray[6]);
    }
}
