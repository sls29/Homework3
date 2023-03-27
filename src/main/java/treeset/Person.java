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

    Set<Person> Persons = new TreeSet<>(new NameComparator());

    private void personAdd(String firstName, int age){
        Persons.add(new Person(firstName, age));
        System.out.println("Person added");
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
