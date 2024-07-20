package com.company;
//question 1

//class Employee {
 //   int salary;
   // String name;
//
  //  public int getSalary() {
    //    return salary;
    // }

 //   public String getName() {
   //     return name;
 //   }

   // public void setName(String n) {
     //   name = n;
  //  }
// }

//  public class  PractiseSet {
 //   public static void main(String args[]) {
     //   Employee kishan = new Employee();
   //     kishan.setName("Let's Code Together");
 //       kishan.salary = 50000;

        //kishan.name = "Kishan";

       // System.out.println(kishan.getSalary());
     //   System.out.println(kishan.getName());
   // }
// }

//question 2


// class Cellphone {
   // public void ring() {
     //   System.out.println("ringing...");
   // }

  //  public void vibrate() {
    //    System.out.println("vibrating...");
    // }

   // public void call() {
     //   System.out.println("calling your friend...");
   // }
// }




// public class PractiseSet  {
 //   public static void main(String args[]) {
   //     Cellphone apple = new Cellphone();
     //   apple.ring();
       // apple.vibrate();
  //      apple.call();
 //   }
// }





//question 3




// class Square {
 //   int side;

 //   public int perimeter() {
 //       return (4 * side);
 //   }

  //  public int area() {
  //      return side * side;
 //   }
// }

// public class  PractiseSet {
   // public static void main(String args[]) {
     ///   Square sq = new Square();
        //sq.side = 5;
  //      System.out.println(sq.perimeter());
    //    System.out.println(sq.area());
   // }
// }




// question 4

// class Rectangle {
   // int length;
  //  int breadth;
//public int perimeter() {
  //      return (2 * length * breadth);
    //}

 //   public int area() {
     //   return length * breadth;
   // }
//}

//  public class  PractiseSet {
    // public static void main(String args[]) {
  //      Rectangle rec = new Rectangle();
//        rec.length = 5;
        // rec.breadth = 4;
      //  System.out.println(rec.perimeter());
    //    System.out.println(rec.area());
  //  }
// }





//question 5

// class TommyVecetti{
   // public void hit(){
     //   System.out.println("Hitting the enemy");
   // }
  //  public void run(){
    //    System.out.println("Running from the enemy");
   // }
  //  public void fire(){
    //    System.out.println("Firing on the enemy");
   // }
// }

// public class  PractiseSet {
   // public static void main(String args[]) {
 //       TommyVecetti player = new TommyVecetti();
        // player.hit();
      //  player.run();
    //    player.fire();
  //  }
// }

//question 6
class Circle {
    double radius;

    public double perimeter() {
        return (2 * radius * Math.PI);
    }

    public double area() {
        return (Math.PI * radius * radius);
    }
}

public class  PractiseSet {
    public static void main(String args[]) {
        Circle cir = new Circle();
        cir.radius = 5.5;
        System.out.println(cir.perimeter());
        System.out.println(cir.area());
    }
}