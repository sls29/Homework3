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
}
