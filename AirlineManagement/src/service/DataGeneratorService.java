package service;

import model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

public class DataGeneratorService {
    private static final HashMap<String, List<Flight>> flightsMap=new HashMap<>();

    public Address generateAddress(String city, String state, String country) {
        return new Address(
                "Sample apartments",
                "Sample area",
                city,
                state,
                country,
                "Sample Landmark"
        );
    }

    public Passport generatePassport(String pn, String dob, String ed, Address address){
        return new Passport(pn,dob,ed, address);
    }

    public Customer generateCustomer(String id, String name, String email, String password, String phone, Passport passport){
        return new Customer(id,name,email,password,phone,passport);
    }

    public Aircraft generateAircraft(String name, String model, int seats, String my){
        return new Aircraft(name,model,seats,my);
    }
    public Airport generateAirport(String name, Address address, String uniqueId){
        return  new Airport(name, address, uniqueId);
    }

    public Flight generateFlight(String origin, String destination, Timer duration, LocalDateTime departure, LocalDateTime arrival, Aircraft aircraft){
        return new Flight(origin, destination, duration, departure, arrival, aircraft);
    }

    public void generateFlightMap(List<Flight>flights){
        for(Flight flight : flights){
            if(flightsMap.containsKey(flight.getDestination()))
                flightsMap.get(flight.getDestination()).add(flight);
            else{
                List<Flight> flightList = new ArrayList<>();
                flightList.add(flight);
                flightsMap.put(flight.getDestination(), flightList);
            }
        }
    }
    // Searching the flight
    public List<Flight> searchFlight(String destinationFlight) {
        try {
            if (flightsMap.containsKey(destinationFlight)) {
                return flightsMap.get(destinationFlight);
            } else {
                throw new Exception("No flights found for the given destination");
            }
        } catch (Exception e) {
            // Handle the exception, log it, or perform any necessary actions
            e.printStackTrace(); // This is a simple example; you might want to handle it more appropriately
            return null; // Or throw a custom exception or return an empty list, depending on your requirements
        }
    }

}
