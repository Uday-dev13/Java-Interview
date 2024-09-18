package Oops;

import org.w3c.dom.ls.LSOutput;

public class Object {

    int i=90;
    int j = 1;
    public Object() {
    }

    public Object( int i,int j){
        this.i =i;
        this.j=j;
    }

    public static void main(String[] args) {
        Object t = new Object();
        Object t1 = new Object(34,78);
        //System.out.println(O.hashCode());
        System.out.println(t1.add());
        System.out.println(t.add());
    }

    public int add(){
        return i+j;
    }


}
