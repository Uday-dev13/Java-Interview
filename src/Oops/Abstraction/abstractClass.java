package Oops.Abstraction;
 abstract class Bike{ // Abstract class can have one abstract and regular methods
     abstract void fuel(); // It needs to be extended and its method implemented in subclass
     Bike(){
         System.out.println("Bike is created");
     }
     void go(){
         System.out.println("Bike is going");
     }
 }

 class honda extends Bike{
     void fuel(){
         System.out.println("Bike has fuel");
     }
 }

public class abstractClass {
    public static void main(String[] args) {
        honda h = new honda();
        h.fuel();
        h.go();
    }

}
