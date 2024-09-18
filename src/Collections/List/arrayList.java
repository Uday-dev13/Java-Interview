package Collections.List;

//List Ordered, Duplicates were allowed.
// Stores in dynamic array.
//The elements stored in the ArrayList class can be randomly accessed.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        // List that holds only String elements( Homogeneous )

        li.add("Sai");
        li.add("Uady");
        li.add("Allu");
        //li.add(9); // Compile-time error: Incompatible types

        for(String s : li){
            System.out.println(s);
        }

        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
