package treeset;

import java.util.*;

public class Aplic implements AplicInterface {
    TreeSet<Person> Persons = new TreeSet<>(new AgeComparator());
    TreeSet<Hobby> Hobbies = new TreeSet<>(new NameComparator());
    HashMap<String, LinkedList<String>> HobbiesAddress = new HashMap<>();

    HashMap<String, LinkedList<String>> PersonHobbies = new HashMap<>();

    public void addNewPerson(Person person) {
        Persons.add(new Person(person.firstName, person.age));
        PersonHobbies.put(person.firstName, new LinkedList<>());
        System.out.println("New person added");
    }

    public void listPersons() {
        for (Person nextPerson : Persons) {
        System.out.println(nextPerson.firstName + " is " +
                nextPerson.age + " years old.");
        }
    }

    @Override
    public void addNewHobby(String hobby, String hobbyAddress) {
        Hobbies.add(new Hobby(hobby));
        HobbiesAddress.put(hobby, new LinkedList<>());
        LinkedList<String> list = HobbiesAddress.get(hobby);
        list.add(hobbyAddress);
        HobbiesAddress.put(hobby, list);
        System.out.println("New Hobby added");
    }

    public void listHobbies() {
        for (Hobby nextHobby : Hobbies) {
            System.out.println(nextHobby.hobbyName);
        }
    }

    @Override
    public void setPersonHobbies(String firstName, String hobby) {
    LinkedList<String> list = PersonHobbies.get(firstName);
    list.add(hobby);
    PersonHobbies.put(firstName, list);
    System.out.println(firstName + " likes to " + hobby);
    }

    public void getPersonHobbies(String firstName){
    LinkedList<String> list = PersonHobbies.get(firstName);
    System.out.println(" ");
    System.out.println(firstName + " likes to " + list);
        for(String nextString : list){
            LinkedList<String> addressList = HobbiesAddress.get(nextString);
            System.out.println("He can " + nextString + " in: " + addressList);
        }
    }
}
