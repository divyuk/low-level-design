package model;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;

public class Airport {
    public String name;
    public Address address;
    public String uniqueId;
    public List<Aircraft>flights = new ArrayList<Aircraft>();

    public Airport(String name, Address address, String uniqueId) {
        this.name = name;
        this.address = address;
        this.uniqueId = uniqueId;
    }
    public void addAircraft( Aircraft aircraft){
        flights.add(aircraft);
    }
    public List<Aircraft> getAircraft(){
        return  flights;
    }
}
