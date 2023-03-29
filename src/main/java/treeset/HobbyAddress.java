package treeset;

import java.util.ArrayList;
import java.util.List;

public class HobbyAddress {
    String county;
   // String country;

    public HobbyAddress(String county) {
        this.county = county;
     //   this.country = country;
    }


    List<HobbyAddress> hobbyAddresses = new ArrayList<>();

    public List<HobbyAddress> hobbyAddressAdd(String county){
        hobbyAddresses.add(new HobbyAddress(county));
        return null;
    }
    public String toString() {
        return  this.county;
    }
}
