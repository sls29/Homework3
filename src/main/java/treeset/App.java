package treeset;


import java.util.*;

public class App {
    public static void main(String[] args) {

        Person Person1 = new Person( "Junior", 16);
        Person Person2 = new Person( "Mister", 36);
        Person Person3 = new Person( "Senior", 61);


    TreeSet<Person> Persons = new TreeSet<>(new NameComparator());

        Persons.add(Person1);
        Persons.add(Person2);
        Persons.add(Person3);

        System.out.println(Persons);
        System.out.println("------------------------------------------");

        Iterator<Person> iterator = Persons.iterator();

        System.out.println("TreeSet data");
        while(iterator.hasNext()) {
            final Person nextPerson = iterator.next();
            System.out.println(nextPerson.firstName + ", " + nextPerson.age);
        }


        Hobby hobby1 = new Hobby("ski", 3);
        Hobby hobby2 = new Hobby("trek", 5);
        Hobby hobby3 = new Hobby("swim", 7);


    List<Hobby> Pers1Hobbies = new LinkedList<>();
    List<Hobby> Pers2Hobbies = new LinkedList<>();
    List<Hobby> Pers3Hobbies = new LinkedList<>();

    List<HobbyAddress> Hobby1Address = new LinkedList<>();
    List<HobbyAddress> Hobby2Address = new LinkedList<>();
    List<HobbyAddress> Hobby3Address = new LinkedList<>();


        Pers1Hobbies.add(hobby1);
        Pers1Hobbies.add(hobby2);

        Pers2Hobbies.add(hobby1);
        Pers2Hobbies.add(hobby3);
//a
        Pers3Hobbies.add(hobby2);
        Pers3Hobbies.add(hobby3);

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

    HashMap<Hobby, List<HobbyAddress>> hobby = new HashMap<>();

        hobby.put(hobby1, Hobby1Address);
        hobby.put(hobby2, Hobby2Address);
        hobby.put(hobby3, Hobby3Address);



    Map<Person, List<Hobby>> map1 = new HashMap<>();


        map1.put(Person1, Pers1Hobbies);
        map1.put(Person2, Pers2Hobbies);
        map1.put(Person3, Pers3Hobbies);

    }
}