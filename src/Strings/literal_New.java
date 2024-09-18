package Strings;

public class literal_New {
    public static void main(String[] args) {
        String s1 = "Hello";// String constant pool
        String s2 = "Hello";//It doesn't create a new instance
        String s3 = new String("Welcome"); // Heap memory
        System.out.println(s2);
        System.out.println(s1+s2);

        //Methods

    }
}
