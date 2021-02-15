package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Duplicate Elements, Maintains Insertion order, non-synchronized-Thread Safe-performance high , accessed randomly
public class ListArrayList {
    public static void main(final String[] args){
        final ArrayList<Integer> studentIds = new ArrayList<>();
        studentIds.add(9);
        studentIds.add(3);
        studentIds.add(1);
        studentIds.add(6);

        if(!studentIds.isEmpty()){
            Collections.sort(studentIds);
            System.out.println("Size of the Array List studentID: "+ studentIds.size());

            //Abstract method
            for (final Integer studentId : studentIds)
                System.out.println(studentId);

            System.out.println("Position of Student ID 3: "+ studentIds.indexOf(3));

            System.out.println("Is List Empty: "+ studentIds.isEmpty());
            studentIds.clear();
            System.out.println("Is List Empty: "+ studentIds.isEmpty());
        }
    }
}
