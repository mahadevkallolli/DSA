package com.thetechbull.variablesdemo;

public class App 
{
    //create static variable,instance variable and local variable then print them

    static int staticVar = 10;
    int instanceVar = 20;

    public static void main( String[] args )
    {
        int localVar = 30;
        System.out.println("Static Variable: "+staticVar);
        App obj = new App();
        System.out.println("Instance Variable: "+obj.instanceVar);
        System.out.println("Local Variable: "+localVar);
    }



}

