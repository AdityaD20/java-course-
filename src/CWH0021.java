package com.company;

public class CWH0021 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

 // using loop-while loop
        int i =1;
        while(i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("finish running while loop");
        while(true){
            System.out.println("i am infinite loop ");
        }

//do while loop
        int b = 10;
        do {
            System.out.println(b);
            b++;

        }while(b<5);

//for loop
      for ( int i=1; i<=10 ;i++){
          System.out.println(i);

        }

      //for even no : 2n
        //for odd no: 2n+1
        int n =5 ;
      for (int i =0 ; i<n; i++){
          System.out.println(2*n+1);
      }

 //decrement for loop
        for(i=7; i>0; i-- ){
            System.out.println(i );
        }

        //Break and continue  using loop
        for (int i = 0; i<5 ; i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i=2){
                System.out.println("Ending the loop");
                break; //continue ;

            }
        }
        System.out.println("loop end now");
    }
}