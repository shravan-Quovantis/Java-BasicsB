package Serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Employee {
    private String name;
    private int age;
    private boolean married;
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(final double score) {
        this.score = score;
    }

    public boolean isMarried(final boolean b) {
        return married;
    }

    public void setMarried(final boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {                   //overriding the toString() method
        return "Name of the Employee: " + name + "\nAge of the Employee: " + age + "\nWork Score: " + score + "\nMarital status:" + married;
    }
}

public class JSONDriver {
    public static void main(final String[] args) throws IOException {
        try {
            final Employee employee = new Employee();
            employee.setAge(25);
            employee.setName("Anant Kaushik");
            employee.isMarried(false);
            employee.setScore(90.5);

            final ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("employee.json"), employee);   //Writing into JSON File
            Employee employeeInformation = mapper.readValue(new File("employee.json"), Employee.class); //Reading from JSON File

            System.out.println("Printing JSON information: \n" + employeeInformation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
