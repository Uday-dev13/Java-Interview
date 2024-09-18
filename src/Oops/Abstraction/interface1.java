package Oops.Abstraction;

interface Shape{
    void draw();// abstract
    void print();
}

class Circle implements Shape{
   public void draw(){
        System.out.println("Circle is drawing");
    }
    public void print(){
        System.out.println("Circle is printing");
    }
}


class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle is drawing");
    }
    public void print(){
        System.out.println("Rectangle is printing");
    }
}


public class interface1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Shape c = new Circle();
        r.draw();
        c.draw();
        r.print();
        c.print();
    }
}
