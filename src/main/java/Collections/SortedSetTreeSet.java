package Collections;

import java.util.Iterator;
import java.util.TreeSet;

//Unique value, stores ascending order
//Implements Sorted Set Interface, uses tree to store
public class SortedSetTreeSet {
    public static void main(final String[] args) {

        final TreeSet<String> cities = new TreeSet<String>();
        cities.add("Bangluru");
        cities.add("Hyderabad");
        cities.add("Gurugram");
        cities.add("Kolkata");
        cities.add("Chennai");
        //cities.add(null);                                     don't store null

        if (!cities.isEmpty()) {
            Iterator<String> city = cities.iterator();
            while (city.hasNext()) System.out.println(city.next());
        }
    }
}
