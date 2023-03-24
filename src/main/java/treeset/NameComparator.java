package treeset;

public class NameComparator implements java.util.Comparator<Person> {
    public int compare(Person p1, Person p2){
        return (p1.firstName).compareTo(p2.firstName);
    }
}
