package treeset;

import java.util.Comparator;
//a
 class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        if(p1.age > p2.age) {
            return -1;

        } else  {
            return 1;
        }
    }
}
