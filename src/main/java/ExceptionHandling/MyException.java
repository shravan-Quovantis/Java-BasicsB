package ExceptionHandling;

import java.util.Scanner;

public class MyException extends RuntimeException {          //we can extend Exception or Throwable as well

    public MyException() {
        super("Not Eligible for Vote");
    }

    public MyException(String message) {
        super(message);
    }

    public static void main(final String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int num = keyboard.nextInt();
            if (num < 18) {
                throw new MyException();
            }
            System.out.println("Eligible for vote");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
