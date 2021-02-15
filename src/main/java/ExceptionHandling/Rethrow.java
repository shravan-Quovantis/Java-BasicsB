package ExceptionHandling;

public class Rethrow {
    public static void main(final String[] args) {

        try{
            doStuff();
        }catch(MyException e){
            System.out.println("Handled Successfully");
        }
        System.out.println("Flow normal");
    }
    public static void doStuff(){
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            throw new MyException("Error occurred in doStuff");           //Now this will throw NullPointerException not ArithmeticException
        }
    }
}
