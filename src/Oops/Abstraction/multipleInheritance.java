package Oops.Abstraction;
// Two super classes  implements by one subclass
interface Animal5{
    void bark6();
}
interface Carnival{
    void eat6();
}

class Dog8 implements Animal5, Carnival{
    public void bark6(){
        System.out.println("Dog is barking");
    }
    public void eat6(){
        System.out.println("Dog is eating");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Dog8 d = new Dog8();
        d.bark6();
        d.eat6();
    }
}
