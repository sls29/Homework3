package treeset;


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
    }
}
