package InnerClass;

public class nonStatic { // Main method and class
    public static void main(String[] args) {
        System.out.println("executed in main method");
    }

    public class Method4{ // These are inner classes -> which are created inside another class
        // It will also create class file with the name OUTERCLASS$innerclass
        // For this Method4 class the class file name is nonStatic$Method4
        // We can create public/private/protected innerclass

    }

    private class Method5{ // These are inner classes -> which are created inside another class

    }

    protected class Method6{

    }

    public class Method7{

    }
    class Method8{

    }
}
class Method2{ //Without public, we can create many no.of classes
    // For every class there is separate class files
    public static void main(String[] args) { // We can have many main methods inside every class
        System.out.println("executed in main method");
    }

}

class Method3{ //Without public, we can create many no.of classes

}