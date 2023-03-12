package treeset;

import java.util.List;

public class Hobby extends HobbyAddress {
    String hobbyName;
    int frequency;

     public Hobby(String hobbyName, int frequency, String county, String country) {

         super(county, country);
         this.hobbyName = hobbyName;
         this.frequency = frequency;
    }
    public String toString() { return "and he enjoy " + this.hobbyName + "ing" +" in " + super.toString(); }
    public String Location() {
         return "A good place to " + this.hobbyName + " is in " + super.toString();
    }
}
