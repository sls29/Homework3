package treeset;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class App
{
    public static void main( String[] args )
    {
        //TreeSet<Person> Persons = new TreeSet<Person>(new NameComparator());
        TreeSet<Person> Persons = new TreeSet<Person>(new AgeComparator());

        Persons.add(new Person(1, "Junior", 16));
        Persons.add(new Person(2, "Mister", 36));
        Persons.add(new Person( 3, "Senior", 61));

        for(Person person : Persons){
            System.out.println(person);
        }

        List<Hobby> Hobbies = new LinkedList<Hobby>();

        Hobbies.add(new Hobby("ski", 3, "Brasov", "Romania"));
        Hobbies.add(new Hobby("ski", 3, "Bavaria", "Germany"));
        Hobbies.add(new Hobby("trekking", 5, "Cluj", "Romania"));
        Hobbies.add(new Hobby("trekking", 5, "Trentino", "Italy"));
        Hobbies.add(new Hobby("swim", 7, "Normandy", "France"));
        Hobbies.add(new Hobby("swim", 7, "Devon", "Great Britan"));



        //HashMap<Person, List<Hobby>> map = new HashMap<>();

    }
}
