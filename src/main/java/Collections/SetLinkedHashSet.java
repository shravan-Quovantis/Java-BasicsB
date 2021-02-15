package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Represents LinkedList implementation of Set, unique elements, Maintains insertion order, Null allowed
//Extends HashSet and Implements Set Interface

public class SetLinkedHashSet {
    public static void main(final String[] args) {
        final LinkedHashSet<String> roles = new LinkedHashSet<>();

        roles.add("Software Engineer");
        roles.add("Software Engineer");
        roles.add("Sr. Software Engineer");
        roles.add(null);
        roles.add(null);
        roles.add("Software Engineer");

        if (!roles.isEmpty()) {
            Iterator role = roles.iterator();
            while (role.hasNext()) System.out.println(role.next());

            System.out.println("\nRemoved Software Engineer: " + roles.remove("Software Engineer") + "\n");

            System.out.println(roles);
        }
    }
}
