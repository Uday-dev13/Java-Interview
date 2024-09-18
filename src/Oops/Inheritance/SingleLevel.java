package Oops.Inheritance;
// One super class is extended by one subclass

class Animal {
    void Sound(){
        System.out.println("Animal is making sounds");
    }
}
class Dog extends Animal{ // Single level Inheritance
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class SingleLevel {
    public static void main(String[] args) {

        Dog myDog = new Dog();// Create an object using last class name that extends the parent class
        myDog.Sound();
        myDog.bark();

    }
}