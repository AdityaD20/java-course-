package com.company;
import java.util.Scanner;


public class CWH05_Takinginput {

    public static void main(String[] args) {
        System.out.println("hello word");
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
       // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2 ");
      //  int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b ;
        System.out.println("The sum of these number is ");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt(); // this is used to validate format of data type which enter by the user
        System.out.println(b1);
       // String str1 = sc.next(); // this will print only first word from sentence
        String str1 = sc.nextLine(); // now this will print whole sentence
        System.out.println(str1);
    }
}