package Oops.Polymorphism;

//subclass is overriding the method of superclass

class Animal9{
    //superclass method
    public void sound2(){
        System.out.println("Animal sounds");
    }
}
class Dog0 extends Animal9{
    //Overriding the sound2() method by Dog0
    public void sound2(){
        System.out.println("Dog sounds");
    }
}

class Cat0 extends Animal9{
    //Overriding the sound2() method by Cat0
    public void sound2(){
        System.out.println("Cat sounds");
    }
}

public class methodOverriding {
    public static void main(String[] args) {

        // Create objects of subclass
        Dog0 dog = new Dog0();
        Cat0 cat = new Cat0();

        // Calls the overriden methods at runtime
        dog.sound2();
        cat.sound2();
    }
}
