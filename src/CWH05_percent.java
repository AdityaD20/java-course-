package com.company;
import java.util.Scanner;


public class CWH05_percent {

    public static void main(String[] args) {
        System.out.println("hello word");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1:");
        int a = sc.nextInt();
        System.out.println("Enter Marks of Subject 2:");
        int b = sc.nextInt();
        System.out.println("Enter Marks of Subject 3:");
        int c = sc.nextInt();
        System.out.println("Enter Marks of Subject 4:");
        int d = sc.nextInt();
        System.out.println("Enter Marks of Subject 5:");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float avrg = (float) sum /500;

        float percentage  = avrg * 100 ;
        System.out.println("The percentage  of these subjects  are ");
        System.out.println(percentage);

    }
}