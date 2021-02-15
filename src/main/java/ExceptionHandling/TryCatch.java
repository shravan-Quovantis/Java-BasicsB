package ExceptionHandling;

import java.util.Scanner;

//Parallel trying to portray the importance of try, catch and and finally block in interaction with Database
public class TryCatch {
    public static void main(final String[] args) {
        System.out.println("Open connection to Database_Alpha");
        try {
            System.out.println("Executing Query on Database_Alpha...");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of divider: ");
            int i = sc.nextInt();
            System.out.println(10 / i);                         //Risky code which can occur in RunTime
            System.out.println("Operation Done Gracefully");
        } catch (ArithmeticException e) {                       //handling the risk
            System.out.println("Execute in another Database_Sigma");
            System.out.println(10 / 2);                         //alternative
        }
        finally {
            System.out.println("Closing the Database_Alpha");
        }
    }
}
