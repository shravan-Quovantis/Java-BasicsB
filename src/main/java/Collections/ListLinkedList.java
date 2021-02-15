package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Duplicate element, Maintains Insertion order, non-synchronized, accessed randomly
public class ListLinkedList {
    public static void main(final String[] args) {
        final LinkedList<String> places = new LinkedList<String>();
        places.add("Ranchi");
        places.add("Ramgarh");
        places.add("Jamshedpur");
        places.add("Dhanbad");
        places.add("Dhanbad");
        places.add("Bokaro");

        if (!places.isEmpty()) {
            Collections.sort(places);

            for (final String place : places) {
                System.out.println(place);
            }
            System.out.println("\nDoes ranchi contain in places List: " + places.contains("Ranchi"));
            System.out.println("Removed element: " + places.poll());

            //To use as DeQueue
            System.out.println("Removed from head: " + places.removeFirst());
            System.out.println("Removed from tail: " + places.removeLast());
        }

    }
}
