package com.thetechbull.controlStraments;

public class example1 {

    //give me example for control statements

    public static void main(String[] args) {
        //if else
        int a = 10;
        if(a>10){
            System.out.println("a is greater than 10");
        }else{
            System.out.println("a is less than or equal to 10");
        }

        //switch case
        int b = 2;
        switch(b){
            case 1:
                System.out.println("b is 1");
                break;
            case 2:
                System.out.println("b is 2");
                break;
            default:
                System.out.println("b is not 1 or 2");
        }

        //for loop
        for(int i=0;i<5;i++){
            System.out.println("i is: "+i);
        }

        //while loop
        int j = 0;
        while(j<5){
            System.out.println("j is: "+j);
            j++;
        }

        //do while loop
        int k = 0;
        do{
            System.out.println("k is: "+k);
            k++;
        }while(k<5);
    }
}
