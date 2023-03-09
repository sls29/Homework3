package treeset;

public class HobbyAddress {
    String county;
    String country;

    public HobbyAddress(String county, String country) {
        this.county = county;
        this.country = country;
    }

    public String toString() {
        return ": " + this.county + ", " + this.country + ".";
    }
}
