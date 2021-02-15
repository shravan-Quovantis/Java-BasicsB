package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Checked exception should be catched using try-catch or be reported using throws keyword
//Compile time Exception
public class CheckedException {
    public static void main(final String[] args)
    throws FileNotFoundException                        //if we don't declare the exception
    {
        PrintWriter pw = new PrintWriter("Abc.txt"); //This line will cause Exception at compile time "Unreported Exception"
        pw.println("Hello");
    }
}
