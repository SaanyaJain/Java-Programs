import java.util.*;

public class vectorclass {

    public static void main(String args[]) {

        Vector<Object> v = new Vector<Object>();
        v.add(new Integer(1));
        v.add("Nikhil");
        v.add("Agarwal");
        v.add(new Double(1.00));

        v.add(new Integer(2));
        v.add("Asohk");
        v.add("Agarwal");
        v.add(new Double(2.00));

        v.add(new Integer(3));
        v.add("Suman");
        v.add("Agarwal");
        v.add(new Double(3.00));

        v.add(new Integer(4));
        v.add("Divya");
        v.add("Agarwal");
        v.add(new Double(4.00));

        System.out.println("Size of vector is: " + v.size());
        System.out.println("Capacity of vector is: " + v.capacity());
        Iterator<Object> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}