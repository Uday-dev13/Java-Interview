package Oops.Inheritance;
// One super class is extended by one subclass and that subclass is extended another subclass

class Animal2{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal2{
    void walk(){
        System.out.println("Mammal is walking");
    }
}

class Cat extends Mammal{ // Multi level Inheritance
    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meow();
        myCat.eat();
        myCat.walk();
    }
}
