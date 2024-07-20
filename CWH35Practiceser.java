
  // public class CWH35Practiceser  {
   //   static void multiplication(int n) {
     //    for (int i=1; i<=10; i++) {
      //        System.out.println(n + " * " + i + " = " + (n*i));
        //  }
   //   }
     // public static void main(String args[]) {
      //    multiplication(9);
    //  }
  // }




  // question 2
  // public class CWH35Practiceser  {
  //    static void pattern(int n) {
     //       for (int i = 0; i < n; i++) {
  //            for (int j = 0; j < i + 1; j++) {
   //               System.out.print("* ");
  //            }
   //           System.out.println();
  //        }
   //   }
 //     public static void main(String args[]) {
  //        pattern(4);
  //    }
 // }

    //question 3
  //  public class cwh_35_ps_pr_03 {
  //      static int recursive_sum(int n) {
   //         if (n==1) {
   //             return 1;
    //        }
   //         else {
   //             return n + recursive_sum(n-1);
   //         }
//
   //     }
   //     public static void main(String args[]) {
   //         System.out.println(recursive_sum(5));
   //     }
   // }


    //question 4
  //  public class cwh_35_ps_pr_04 {
   //     static void pattern(int n) {
   //         for (int i = n; i > 0; i--) {
   //             for (int j = 0; j < i; j++) {
   //                 System.out.print("* ");
   //             }
   //             System.out.println();
   //         }
  //      }
   //     public static void main(String args[]) {
   //         pattern(5);
   //     }
  //  }


    //question 5
   // public class cwh_35_ps_pr_05 {
   //     static int fibonacci(int n) {
    //        if ( n==1 || n == 2) {
   //             return (n-1);
    //        }
    //        else {
    //            return (fibonacci(n-1) + fibonacci(n-2));
    //        }
    //    }
    //    public static void main(String args[]) {
    //        System.out.println(fibonacci(5));
    //    }
   // }

    //question 6
  //  public class cwh_35_ps_pr_06 {
  //      static int avg(int ...arr) {
 //           int len = arr.length;
  //          int sum = 0;
  //          for (int element:arr) {
  //              sum += element;
  //          }
   //         int average = sum / len;
   //         return average;
   //     }
    //    public static void main(String args[]) {
    //        System.out.println(avg(1,2,3,4,5,34,564,234));
   //     }
 //   }

    //question 7
   // public class cwh_35_ps_pr_07 {
     //   static void pattern_rec(int n) {
       //     if (n > 0) {
         //       for (int i = 0; i < n; i++) {
           //         System.out.print("*");
             //   }
               // System.out.println();
//                pattern_rec(n - 1);
  //          }

    //    }
      //  public static void main(String args[]) {
        //    pattern_rec(5);
    //    }
   // }

    //question 8

 // public class cwh_35_ps_pr_08 {
   //   static void pattern_rec(int n) {
     //     if (n > 0) {
       //       pattern_rec(n - 1);
         //     for (int i = 0; i < n; i++) {
           //       System.out.print("*");
             // }
 //             System.out.println();
   //       }
     // }
   //   public static void main(String args[]) {
     //     pattern_rec(5);
    //  }
 // }

  //question 9

  //  public class cwh_35_ps_pr_09 {
  //    static float cel_to_feh(float n) {
    //      float temp = n * (9/5f) + 32;
      //    return temp;
 //     }
   //   public static void main(String args[]) {
     //     System.out.println(cel_to_feh(100.5f));
 //     }
  // }


  //questio 10

 // public class cwh_35_ps_pr_10 {
   //   static int sum(int n) {
     //     int sum = 0;
       //   for (int i=1; i<=n; i++) {
         //     sum += i;
         // }
        //  return sum;
    //  }
      // public static void main(String args[]) {
 //         System.out.println(sum(5));
   //   }
  /// }