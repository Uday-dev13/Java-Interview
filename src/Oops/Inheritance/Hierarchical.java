package Oops.Inheritance;
 // Many subclasses extends one Super class
class Animal3{
    void sneeze(){
        System.out.println("Animal is Sneezing");
    }
}

class Dog3 extends Animal3{
    void run(){
        System.out.println("Dog is running");
    }
}

class Cat3 extends Animal3{
    void drink(){
        System.out.println("Cat is drinking");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Cat3 myCat4 = new Cat3();
        Dog3 myDog4 = new Dog3();
        myCat4.drink();
        myCat4.sneeze();
        myDog4.run();

    }
}
