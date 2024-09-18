package Java_8.LambdaExp;

@FunctionalInterface
interface Vehicle{
    public int getSpeed();
}

class bike implements Vehicle{
    public int getSpeed(){
        return 90;
    }
}

public class DoublePara {
    public static void main(String[] args) {
        bike b = new bike();
        System.out.println(b.getSpeed());

        Vehicle v = new Vehicle() {
            @Override
            public int getSpeed() {
                return 80; // if there is only one return statement we can remove {} and Return also
            }
        };
        System.out.println(v.getSpeed());


        Vehicle v2 = () -> {
            int speed5 = 60;
            System.out.println("TATA IS RUNNING");
            return speed5;
        };
        System.out.println(v2.getSpeed());



    }
 }

