package Oops.Polymorphism;
// Same method name(add) with different parameters(a,b & a,b,c )
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

}

public class methodOverloading { // Compile-time ( Static ) polymorphism
    public static void main(String[] args) {
        Calculator c= new Calculator();
        int d = c.add(3,5);
        int e = c.add(5,8,90);

        System.out.println(d);
        System.out.println(e);
    }
}
