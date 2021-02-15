package Generics;

class BoundedClass<T extends Number> {            //T is type parameter
    private final T data;                               //Variable of T type

    public BoundedClass(final T data) {
        this.data = data;

    }

    public T getData() {
        return data;
    }
}

class BoundedDriver {
    public static void main(final String[] args) {

        //trying to pass other than Number it will give compile time error
        final BoundedClass<Integer> intObj = new BoundedClass<>(8);
        System.out.println("Bounded Generic Class returned: " + intObj.getData());

        final BoundedClass<Double> doubleObj = new BoundedClass<>(3.2);
        System.out.println("Bounded Generic Class returned: " + doubleObj.getData());

    }
}
