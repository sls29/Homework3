package treeset;


import java.util.*;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person( "Junior", 16);
        Person person2 = new Person( "Mister", 36);
        Person person3 = new Person( "Senior", 61);


    Set<Person> Persons = new TreeSet<>(new NameComparator());

        Persons.add(person1);
        Persons.add(person2);
        Persons.add(person3);
    //    System.out.println(Persons);
        System.out.println("------------------------------------------");

        Iterator<Person> iterator = Persons.iterator();

        System.out.println("TreeSet data");
        while(iterator.hasNext()) {
            final Person nextPerson = iterator.next();
            System.out.println(nextPerson.firstName + " is " + nextPerson.age+ " years old.");
        }


    Hobby hobby1 = new Hobby("ski", 3);
    Hobby hobby2 = new Hobby("trek", 5);
    Hobby hobby3 = new Hobby("swim", 7);

    List<Hobby> Person1Hobbies = new LinkedList<>();
    List<Hobby> Person2Hobbies = new LinkedList<>();
    List<Hobby> Person3Hobbies = new LinkedList<>();

    List<HobbyAddress> Hobby1Address = new LinkedList<>();
    List<HobbyAddress> Hobby2Address = new LinkedList<>();
    List<HobbyAddress> Hobby3Address = new LinkedList<>();

        Person1Hobbies.add(hobby1);
        Person1Hobbies.add(hobby2);

        Person2Hobbies.add(hobby1);
        Person2Hobbies.add(hobby3);

        Person3Hobbies.add(hobby2);
        Person3Hobbies.add(hobby3);

        HobbyAddress Address1 = new HobbyAddress("Bavaria", "Germany");
        HobbyAddress Address2 = new HobbyAddress("Trentino", "Italy");
        HobbyAddress Address3 = new HobbyAddress("JungFrau", "Swiss");
        HobbyAddress Address4 = new HobbyAddress("Venetia", "Italy");
        HobbyAddress Address5 = new HobbyAddress("Barcelona", "Spain");
        HobbyAddress Address6 = new HobbyAddress("Creta", "Greece");
        HobbyAddress Address7 = new HobbyAddress("Cluj", "Romania");
        HobbyAddress Address8 = new HobbyAddress("Sierra Madre", "Spain");
        HobbyAddress Address9 = new HobbyAddress("Acropolis", "Greece");

        Hobby1Address.add(Address1);
        Hobby1Address.add(Address2);
        Hobby1Address.add(Address3);

        Hobby2Address.add(Address4);
        Hobby2Address.add(Address5);
        Hobby2Address.add(Address6);

        Hobby3Address.add(Address7);
        Hobby3Address.add(Address8);
        Hobby3Address.add(Address9);

    Map<Hobby, List<HobbyAddress>> hobby = new HashMap<>();

        hobby.put(hobby1, Hobby1Address);
        hobby.put(hobby2, Hobby2Address);
        hobby.put(hobby3, Hobby3Address);



    Map<Person, List<Hobby>> map1 = new HashMap<>();


        map1.put(person1, Person1Hobbies);
        map1.put(person2, Person2Hobbies);
        map1.put(person3, Person3Hobbies);



    System.out.println(map1.get(person1));


    System.out.println(hobby.get(hobby1));

    }
}