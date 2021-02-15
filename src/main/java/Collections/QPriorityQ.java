package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

//Implements Queue Interface, Hold element/object by priority, No Null values
public class QPriorityQ {
    public static void main(final String[] args) {
        final PriorityQueue<Integer> priorities = new PriorityQueue<>();
        priorities.add(10);
        priorities.add(11);
        priorities.add(9);
        priorities.add(3);
        priorities.add(12);

        if (!priorities.isEmpty()) {
            System.out.println("head: " + priorities.element());
            System.out.println("Head: " + priorities.peek());

            System.out.println("Iterating the elements:");
            for (final Integer priority : priorities) System.out.println(priority);

            System.out.println(priorities);
            priorities.remove();
            System.out.println(priorities);
            priorities.poll();
            System.out.println(priorities);
        }
    }
}
