package treeset;


import java.util.*;

public class App {
    public static void main(String[] args) {

        Person Person1 = new Person( "Junior", 16);
        Person Person2 = new Person( "Mister", 36);
        Person Person3 = new Person( "Senior", 61);

        System.out.println(Person2.firstName);
        System.out.println(Person2.age);
        System.out.println(Person2.equals(Person1));
        System.out.println(" ");

        TreeSet<Person> Persons = new TreeSet<Person>(new NameComparator());
        //TreeSet<Person> Persons = new TreeSet<Person>(new AgeComparator());

        Persons.add(Person1);
        Persons.add(Person2);
        Persons.add(Person3);

        System.out.println(Persons);
        System.out.println("------------------------------------------");

        Iterator<Person> iterator = Persons.iterator();

        System.out.println("Treeset data");
        while(iterator.hasNext()) {
            final Person nextPerson = iterator.next();
            System.out.println(nextPerson.firstName + ", " + nextPerson.age);
        }

        // for(Person person : Persons){
        //    System.out.println(person);
        // }


        Hobby hobby1 = new Hobby("ski", 3, "Brasov", "Romania");
        Hobby hobby2 = new Hobby("ski", 3, "Bavaria", "Germany");
        Hobby hobby3 = new Hobby("trek", 5, "Cluj", "Romania");
        Hobby hobby4 = new Hobby("trek", 5, "Trentino", "Italy");
        Hobby hobby5 = new Hobby("swim", 7, "Normandy", "France");
        Hobby hobby6 = new Hobby("swim", 7, "Devon", "Great Britan");

        List<Hobby> Hobbies1 = new LinkedList<Hobby>();
        List<Hobby> Hobbies2 = new LinkedList<Hobby>();
        List<Hobby> Hobbies3 = new LinkedList<Hobby>();

        Hobbies1.add(hobby1);
        Hobbies2.add(hobby2);
        Hobbies1.add(hobby3);
        Hobbies3.add(hobby4);
        Hobbies2.add(hobby5);
        Hobbies3.add(hobby6);

        System.out.println(" ");
        System.out.println(hobby2.Location());
        System.out.println(hobby4.Location());
        System.out.println(hobby6.Location());

        Map<Person, List<Hobby>> map1 = new HashMap<>();
        Map<Person, List<Hobby>> map2 = new HashMap<>();
        Map<Person, List<Hobby>> map3 = new HashMap<>();

        System.out.println("");
        System.out.println(map1);

        map1.put(Person1, Hobbies1);
        map2.put(Person2, Hobbies2);
        map3.put(Person3, Hobbies3);

        System.out.println("");
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

    }
}