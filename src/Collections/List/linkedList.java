package Collections.List;

import java.util.LinkedList;
import java.util.List;
//List Ordered, Duplicates were allowed.
// Stores in doubly linked list
//In LinkedList, the manipulation is fast because no shifting is required.

public class linkedList {
    public static void main(String[] args) {
        List<Object> li2 = new LinkedList<>();
        // List that holds elements of any Type ( Heterogeneous )

        li2.add("Nani");//String type
        li2.add(3);// Integer type
        li2.add(2.55);// Double type

        for (Object o : li2){
            System.out.println(o);
        }
    }
}
