
public class CWH31 {
    //eg.1
   // public static void main(String[] args) {

       //eg.1
      //   int a  =5;
        // int b =7;
        // int c;
        // if(a>b){
          //   c =a+b;
         // }
         // else {
           //  c =(a +b) * 5;
         // }
         //  int a1 =2;
       //  int b1 = 1;
       // int c1;
      //  if(a1>b1){
        //     c1 = a+b;
      //   }
      //   else {
        //     c1 =(a1 +b1) *5;
             
     //    }
      //  System.out.println(c);
 
 //  }
 //}

    //eg.2
static int logic(int x, int y){
    int z;
    if(x>y){
        z =x+y;

    }
    else {
        z = (x + y) * 5;
    }
   // x = 566;
    return z;
}
    public static void main(String[] args) {
        int a = 5;
        int b =7;
        int c;
        // Method invocation using object creating

        c = logic(a,b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
       c1 = logic(a1,b1);
            System.out.println(c);
            System.out.println(c1);
        }
      }

