package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
    String color;
    public Animal(String color) {
        this.color = color;
    }
}

//Writing object state to the file to transfer over the network or to keep locally
public class Serialization {
    public static void main(final String[] args) {
        Animal animal = new Animal("Red");                                  //Defining the state of class
        try {
            FileOutputStream fout = new FileOutputStream("file.txt");       //Passing file as String
            ObjectOutputStream out = new ObjectOutputStream(fout);            //Creating Writer for given reference
            out.writeObject(animal);
            out.flush();                                                    //assures All data has been transferred
            out.close();                                                    //Close the file
            System.out.println("Successfully object has been written in file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
