package Collections;

import java.util.Stack;

//Subclass of vector, LIFO, contains vector methods,
public class ListStack {
    public static void main(final String[] args) {
        ListStack collectionsListStack = new ListStack();
        final Stack<String> courses = new Stack<>();
        courses.push("MCA");
        courses.push("B.Tech");
        courses.push("M.Tech");

        if (!courses.isEmpty()) {
            collectionsListStack.print(courses);

            System.out.println("Popped Element: " + courses.pop());
            if (!courses.isEmpty()) {
                courses.pop();
            }

            System.out.println("Peeked Element: " + courses.peek());  //last inserted element

            collectionsListStack.print(courses);
        }
    }

    private <T> void print(final T data) {
        System.out.println(data);
    }

}
