package com.company;

public class CWH_09_Precedance  {

    public static void main(String[] args) {
        // Precedence & Associativity  

         int a = 6*5-34/2;
         /*
         =30-34/2
         =30-17
         =13
          */
         int b = 60/5-34*2;
         /*
          =12-34*2
          =12-68
          =-56
         */
        System.out.println(a);
        System.out.println(b);

        //quick quiz  1. 6*1/2 ,
         int x = 6 ;
         int y = 1;
         int k = x * y/2;
        System.out.println(k);
//bsquare-4ac/2a
int m =1;
int n= 4;
int z = 7;
int p = b*b - (4*n*z) /2*m;
        System.out.println(p);


        // resulting data types  -- in notes
        //increment and decrement
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int y1 = 7;
        int x1= ++y1*8;
        System.out.println(x1);



//practice set 2
//question 1
        float s1 = 7;
        float s2 = 4;
        float s3 = 9;
        float s4 = 2 ;
        float R1 = s1/s2;
        float R2 = s3 / s4 ;
        float R3 = R1 * R2 ;
        System.out.println("the result of this eq:");
        System.out.println(R3);


        //question 2 perform increption in grade and decreption also
        //for increption
        char grade =  'B' ;
           grade = (char) (grade + 8);
        System.out.println(grade);
        //for decreption

          grade = (char) (grade - 8);
        System.out.println(grade);
    }

}