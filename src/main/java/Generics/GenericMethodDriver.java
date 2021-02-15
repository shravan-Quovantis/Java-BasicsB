package Generics;//Application: System.out.println()

class GenericMethod {
    public <Q> void print(final Q data) {
        System.out.println("Output from Generic Method: " + data);
    }
}

public class GenericMethodDriver {
    public static void main(final String[] args) {
        final GenericMethod genericMethodTest = new GenericMethod();
        genericMethodTest.<String>print("Quovantis");
        genericMethodTest.<Integer>print(15);
        genericMethodTest.print("Without type Parameter of Method");
    }
}
