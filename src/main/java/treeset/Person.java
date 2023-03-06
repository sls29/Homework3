package treeset;

public class Person {

    int id;
    String firstName;
    int age;

    public Person(int id, String firstName, int age){
        this.id = id;
        this.firstName = firstName;
        this.age = age;
    }

    public String toString(){
        return " " + this.id + ". " +this.firstName + " - " + this.age;
    }

}
