package treeset;


import java.util.Set;
import java.util.TreeSet;

public class Person {
    String firstName;
    int age;

    public Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }
    public String toString(){
        return " " + this.firstName + " is " + this.age + " years old ";
    }

}
