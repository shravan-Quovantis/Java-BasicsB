package Generics;

class Product<T> {                    //T is type parameter
    //variable of T type
    private final T productDetail;

    public Product(final T prod) {
        this.productDetail = prod;
    }

    public T getProductDetail() {
        return productDetail;
    }

}

class ClassDriver {
    public static void main(final String[] args) {
        //initializing generic class with Integer data
        final Product<Integer> productInt = new Product<Integer>(0121);
        System.out.println("Generics.Product: " + productInt.getProductDetail());

        //initializing generic class with String data
        final Product<String> productString = new Product<>("Chair");
        System.out.println("Generics.Product: " + productString.getProductDetail());

    }
}
