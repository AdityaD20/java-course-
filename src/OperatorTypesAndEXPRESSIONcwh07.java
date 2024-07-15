package com.company;

public class OperatorTypesAndEXPRESSIONcwh07  {

    public static void main(String[] args) {


        //  Arithmetic operator
        int a =4;
         // int b = 6 - a;
        // int b = 6 + a; //+_*/ any ...
        int b = 6 % a;
        System.out.println(b);


        // assignment operator
        int c = 5;
        c += 10;
        //c *=10;
        System.out.println(c);


        //comparison operator
        System.out.println(6==8);


        //logical operator
        System.out.println(64>5 && 64>8); //logical operator both conditions should be true for true in output
        System.out.println(64>5 ||  64>8); // or in logical operator


        //Bitwise operator
        System.out.println(2&3);
    }
}