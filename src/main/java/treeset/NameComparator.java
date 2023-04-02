package treeset;

public class NameComparator implements java.util.Comparator<Hobby> {
    public int compare(Hobby p1, Hobby p2){

        return (p1.hobbyName).compareTo(p2.hobbyName);
    }
}
