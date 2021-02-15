package ExceptionHandling;

//Abnormal termination of program - not recommended
public class DefalutEHandler {              //as there is no handling code default JVM will handle the exception
    public static void main(final String[] args) {
        calculation();
    }

    public static void calculation() {
        divide();
    }

    public static void divide() {
        print();
        int result = 1 / 0;                       //No exception handling code so method will be terminated and removed from stack
    }

    public static void print() {
        System.out.println("Hello");
    }

}
