package com.thetechbull.Arrays.SDArrays.relatedDemo;

import javax.sound.midi.Soundbank;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {

        int[] numbers={100,20,300,2,5,8,9};

        int largest=numbers[0];

        for (int i=1;i< numbers.length;i++){
            if (numbers[i] == numbers[i + 1]){
                largest=numbers[i];
            }
        }
        System.out.println(largest);

    }
}
