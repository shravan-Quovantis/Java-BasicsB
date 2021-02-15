package Collections;

import java.util.HashSet;
import java.util.Iterator;

//uses Hashing to store, unique item, null is allowed
public class SetHashSet {
    //stores Unique item
    public static void main(final String[] args) {
        final HashSet<String> cars = new HashSet<>();
        cars.add("Audi");
        cars.add("Lamborghini");
        cars.add(null);
        cars.add(null);
        cars.add("Audi");
        cars.add("Tesla");

        if (!cars.isEmpty()) {
            Iterator car = cars.iterator();
            while (car.hasNext()) System.out.println(car.next());

            System.out.println(cars.isEmpty());
            System.out.println(cars.size());
            cars.clear();
            System.out.println(cars.isEmpty());
            //System.out.println(cars);
        }
    }
}
