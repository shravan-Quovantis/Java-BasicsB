package Collections;

import java.util.*;
class Employee{
    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
}

public class HashMapTest {
    //store key and value pair, keys should be unique,  non synchronized, maintains no order
    //implements the Map interface
    public static void main(final String[] args){
        Map<Integer,String> fruits = new HashMap<>();           //Creating HashMap
        fruits.put(1,"Mango");                                  //Put elements in Map
        fruits.put(2,"Apple");
        fruits.put(3,"Banana");
        fruits.put(4,"Grapes");
        fruits.put(4, "Berries");                    //the Key: 4 will contain the last value "Berries"

        if(!fruits.isEmpty()){
            System.out.println("Iterating Hashmap Fruits through Entry set...");
            for(final Map.Entry fruit : fruits.entrySet()){
                System.out.println(fruit.getKey()+" "+fruit.getValue());
            }

            //Methods
            System.out.println("Size of the map: "+ fruits.size());
            System.out.println("Printing the Map: \n"+ fruits);

            if (fruits.containsKey(3)){
                String fruit = fruits.get(3);
                System.out.println("Fruit for Key 3: "+ fruit );
                System.out.println("Fruit for Key 3: "+ fruits.get(3));
            }

            //Mapping object
            Employee employeeA = new Employee("Sumit", 76, "MCA");
            Employee employeeB = new Employee("Shubham", 80, "MTech");
            Employee employeeC = new Employee("Akash", 76, "PHED");

            Map<Integer, Employee> employeeHashMapTest = new HashMap<>();
            employeeHashMapTest.put(1, employeeA);
            employeeHashMapTest.put(2, employeeB);
            employeeHashMapTest.put(3, employeeC);

            System.out.println("\nIterating Employee HashMap through EntrySet:");
            for(final Map.Entry<Integer, Employee> employee: employeeHashMapTest.entrySet()){
                int key = employee.getKey();
                Employee emp = employee.getValue();
                System.out.println(key + " " + emp.getName() +" "+ emp.getAge() + " "+ emp.getDept());
            }

            System.out.println("\nIterating Employee HashMap through lambda");
            employeeHashMapTest.forEach((k,v)-> System.out.println(k + " " + v.getName() +" "+ v.getAge() + " "+ v.getDept()));
        }
    }
}
