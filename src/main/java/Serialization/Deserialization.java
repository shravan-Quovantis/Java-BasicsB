package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Reading object from the given file
public class Deserialization {
    public static void main(final String[] args){
        try{
            FileInputStream fin = new FileInputStream("file.txt");
            ObjectInputStream inpt = new ObjectInputStream(fin);        //Creating Reader
            Animal animal = (Animal)inpt.readObject();               //Reading object and typecasting of class(Animal) type
            System.out.println(animal.color);                              //Accessing the state of object
            inpt.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
