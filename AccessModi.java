 package com.company;

 class Employee {

     private int id;
     private  String name;

     public String getName(){
         return name;
     }
     public void setName(String n){
         name = n;
     }
     public void setId(int i){
         id = i;
     }
     public int getId(){
         return id;
     }
 }

 public class AccessModi {
     public static void main(String[] args) {
         Employee emp1 = new Employee();

         emp1.setName("Shubham");
         System.out.println(emp1.getName());
         emp1.setId(123);
         System.out.println(emp1.getId());

     }
 }
