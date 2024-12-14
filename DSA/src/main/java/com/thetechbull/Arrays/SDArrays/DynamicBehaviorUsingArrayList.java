package com.thetechbull.Arrays.SDArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicBehaviorUsingArrayList {
    public static void main(String[] args) {

        Integer[] integers={10,20,30,40,50};

        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(integers));
        arrayList.add(2,22);
        System.out.println(arrayList);
    }
}
