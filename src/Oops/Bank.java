package Oops;

public class Bank {
    static int currBal = 1000;

    public static void greetCustomer(){ // Static method
        System.out.println("Hello! How are you.");
        System.out.println(STR."Current Balance :\{currBal}");
        System.out.println("Current Balance : " + currBal);
    }
    public void deposit( int amount){ // NonStatic method
        currBal = currBal + amount;
        System.out.println("Amount is deposited successfully");
    }

    public void withDraw(int amount){
        currBal = currBal - amount;
        System.out.println("Amount is withdraw successfully");
    }
    public int getCurrBal(){
        return currBal;
    }

    public static void main(String[] args) {
        greetCustomer();// Static methods were directly called
        //deposit(800);// For Non static methods need to create an Object to call
        Bank bank = new Bank();//Object
        bank.deposit(700);
        System.out.println("Current Balance is "+ bank.getCurrBal());
        bank.withDraw(300);
        System.out.println("Current Balance is "+ bank.getCurrBal());
        bank.getCurrBal();
    }
}
