package Collections;

import java.util.Iterator;
import java.util.Vector;

//Uses dynamic array, Synchronized, contains many method which is not part of collection framework
public class ListVector {
    public static void main(final String[] args) {
        final Vector<String> carriers = new Vector<>();
        carriers.add("Quovantis");
        carriers.add("HSBC");
        carriers.add("University of Hyderabad");
        carriers.add("Marwari college Ranchi");

        if (!carriers.isEmpty()) {
            Iterator carrierA = carriers.iterator();
            while (carrierA.hasNext()) System.out.println(carrierA.next());

            System.out.println("\nRemoved element: " + carriers.remove(1) + "\n");

            Iterator carrierB = carriers.iterator();
            while (carrierB.hasNext()) System.out.println(carrierB.next());
        }
    }
}
