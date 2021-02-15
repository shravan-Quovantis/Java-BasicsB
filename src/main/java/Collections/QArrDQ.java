package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

//Implements Dequeue Interface, Dequeue operation, delete/add from both end, faster than ArrayList and Stack
//No capacity restriction

public class QArrDQ {
    public static void main(final String[] args) {
        final ArrayDeque<String> fruits = new ArrayDeque<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add("Strawberry");
        fruits.add("Berries");

        if (!fruits.isEmpty()) {
            Iterator fruit = fruits.iterator();
            while (fruit.hasNext()) System.out.println(fruit.next());

            System.out.println("\nPeek last fruit: " + fruits.peekFirst());
            System.out.println("Peek First fruit: " + fruits.peekLast());
            System.out.println("Remove first fruit: " + fruits.removeFirst());
            System.out.println(fruits);
            System.out.println("\nRemove Last Fruit: " + fruits.removeLast());
            System.out.println(fruits);
        }
    }
}
