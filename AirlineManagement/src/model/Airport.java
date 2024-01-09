package model;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;

public class Airport {
    String name;
    Address address;
    String uniqueId;
    List<Flight>flights = new ArrayList<>();

    public Airport(String name, Address address, String uniqueId, List<Flight> flights) {
        this.name = name;
        this.address = address;
        this.uniqueId = uniqueId;
        this.flights = flights;
    }
}
