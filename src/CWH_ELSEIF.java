package com.company;
import java.util.Scanner;
public class CWH_ELSEIF {

    public static void main(String[] args) {

        //else if if else

       int age;
        System.out.println("Enter Your Age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("you can experiences!");
         }
        else if(age>46){
            System.out.println("you have semi- experience ");
        }
        else if(age>36){
            System.out.println("you have semi-semi experience ");
        }
        else{
            System.out.println("you are not experienced ");



            // switch case
            int age;
            switch(age){
                case 13:
                    System.out.println("you are going to become an Adult ");
                    break;
                case 23:
                    System.out.println("you are going to join job");
                    break;
                case 60:
                    System.out.println("are you going to retired");
                    break;
                default:
                    System.out.println("Enjoy your life");
            }
        }
    }
}