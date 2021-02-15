package ExceptionHandling;

//These methods contains in throwable class so any child class can use them
public class Methods {
    public static void main(final String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            e.printStackTrace();    //Internally contains print method, used by default exception handler for full info
            System.out.println("Output of e: " +e);
            System.out.println("Output of e.toString(): "+ e.toString());
            System.out.println("Output of e.getMessage(): " + e.getMessage());
        }
    }
}
