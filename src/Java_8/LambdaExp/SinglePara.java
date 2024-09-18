package Java_8.LambdaExp;

@FunctionalInterface
interface Car{
    //    public void drive(); // Without parameters
    public void drive2(int speed); // WIth single parameter
}

class Audi implements Car{ // normal way of executing
    @Override
//    public void drive(){ // Without parameters
    public void drive2(int speed) { // With single parameter
        System.out.println("Audi is driving");
    }
}

public class SinglePara {
    public static void main(String[] args) {

        // To execute audi - Create instance of audi
        Audi a = new Audi(); // Normal way of executing
//        a.drive();
        a.drive2(80);

        // Using Anonymous class
        Car c1 = new Car() {
            @Override
            //public void drive() { // Without parameters
            public void drive2(int speed) { // With single parameter
                System.out.println("Audi is driving - anonymous class");
            }
        };
//        c1.drive();
        c1.drive2(60);


        // Lambda exp using anonymous function
        // # components : argument list, arrow token, function body

//        Car c2 = ()->{ // If there is no parameter - need to mention () parenthesis

        Car c2 = (speed) -> { // We can also remove datatype
            // We can also remove () if there is one parameter
            // We can not remove () if there are 2 parameters
//            int speed = 90;
            System.out.println("Tata is driving - Lamda exp - anonymous fun ");
            System.out.println("Car is running smoothly at speed " + speed);

            if (speed > 50) {
                System.out.println("Car is running Rashly");
            } else {
                System.out.println("Car is running slowly");
            }
            // If we have multiple lines of Sout need to keep { } if not we can remove { };
        }; // After completing of function need to keep - ;

//        c2.drive();
        c2.drive2(70);

    }
}
