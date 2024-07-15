package com.company;
import java.util.Scanner;
public class  CWHSting {

    public static <string> void main(String[] args) {
 // print types :-


         // String name = new String("ADITYA");

 //print
        String name = "ADITYA";
        System.out.print("the name are :");

 //println
        System.out.println(name);

 //printf
        int a = 6 ;
        float b = 5.667f;
        System.out.printf("the value of a is %d and value of b is %f" , a,b );
 //format print
        System.out.format("the value of a is %d and value of b is %f" , a,b );
  //
        Scanner sc = new Scanner(System.in);
       // String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);


         // string methods

         String  abc   = "aditya";
        System.out.println(abc);

 //************** length
int value = name.length();
System.out.println(value);

//************** to lowercase
String lstring = name.toLowerCase();
System.out.println(lstring);

//************** to uppercase
        String upstring = name.toUpperCase();
        System.out.println(upstring );

 //************** to trim

        String any = "      aditya     ";
        System.out.println(any);
        String trimany = any.trim();
        System.out.println(trimany);

  //************** to substring
        System.out.println(name.substring(2));

 //************** to substring start and end
        System.out.println(name.substring(2,4));

 //************** to replace

        System.out.println(name.replace( 'i','p'));
        
 //************** to startwith

        System.out.println(name.startsWith("ADI"));

 //************** to endwith
        System.out.println(name.endsWith("YA"));

 //************** to charAt

        System.out.println(name.charAt(2));

 //************** to indexof
        System.out.println(name.indexOf("D"));

 //************** to indexof
        System.out.println(name.indexOf("A" ,3));

//************** to lastindexof
        System.out.println(name.lastIndexOf("ty"));

 //************** to lastindexoftii
        System.out.println(name.lastIndexOf("ty",3));

//************** to equal
        System.out.println( name.equals("ADITYA"));

 //************** to equalIGNORECASE
        System.out.println( name.equalsIgnoreCase("ADITYA"));






       // Escape seqwuence

        System.out.println("i am escape sequence \" double quote" );
        System.out.println("i am escape sequence \\ double quote" );
        System.out.println("i am escape sequence \n double quote" );
        System.out.println("i am escape sequence \t double quote" );

    }
}


