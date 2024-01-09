package util;

import enums.SeatCategory;
import model.*;
import service.DataGeneratorService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

public class AirlineBookingSystem {

    private  List<Airport>airports = new ArrayList<>();
    private   List<Flight>flights = new ArrayList<>();
    // For searching Flights based on the  location
//    private HashMap<String, List<Flight>> flightsMap=new HashMap<>();


    //Some Dummy Data
    DataGeneratorService dataGenerator = new DataGeneratorService();

    // Generate sample addresses
    Address newYorkAddress = dataGenerator.generateAddress("New York", "NY", "USA");
    Address londonAddress = dataGenerator.generateAddress("London", "England", "UK");
    Address tokyoAddress = dataGenerator.generateAddress("Tokyo", "Tokyo", "Japan");

    // Generate sample passports
    Passport alicePassport = dataGenerator.generatePassport("AB123456", "19850115", "20250115", newYorkAddress);
    Passport bobPassport = dataGenerator.generatePassport("CD789012", "19901020", "20251020", londonAddress);
    Passport elenaPassport = dataGenerator.generatePassport("EF345678", "19800305", "20240305", tokyoAddress);

    // Generate sample customers
    Customer aliceCustomer = dataGenerator.generateCustomer("C001", "Alice Johnson", "alice@example.com", "pass123", "1234567890", alicePassport);
    Customer bobCustomer = dataGenerator.generateCustomer("C002", "Bob Smith", "bob@example.com", "pass456", "9876543210", bobPassport);
    Customer elenaCustomer = dataGenerator.generateCustomer("C003", "Elena Rodriguez", "elena@example.com", "pass789", "5678901234", elenaPassport);

    // Generate sample aircrafts
    Aircraft airbusA320 = dataGenerator.generateAircraft("Airbus A320", "A320", 150, "2020");
    Aircraft boeing737 = dataGenerator.generateAircraft("Boeing 737", "737", 180, "2021");
    Aircraft embraerE190 = dataGenerator.generateAircraft("Embraer E190", "E190", 100, "2019");

    // Generate sample airports
    Airport jfkAirport = dataGenerator.generateAirport("JFK International Airport", newYorkAddress, "JFK");
    Airport heathrowAirport = dataGenerator.generateAirport("Heathrow Airport", londonAddress, "LHR");
    Airport naritaAirport = dataGenerator.generateAirport("Narita International Airport", tokyoAddress, "NRT");

    // Generate sample flights
    Flight jfkToHeathrowFlight = dataGenerator.generateFlight("JFK", "LHR", new Timer(), LocalDateTime.now(), LocalDateTime.now().plusHours(7) , airbusA320);
    Flight heathrowToNaritaFlight = dataGenerator.generateFlight("LHR", "NRT", new Timer(), LocalDateTime.now(), LocalDateTime.now().plusHours(12), boeing737);
    Flight naritaToJfkFlight = dataGenerator.generateFlight("NRT", "JFK", new Timer(), LocalDateTime.now(), LocalDateTime.now().plusHours(15),embraerE190);








    // Do the Reservation
    public Reservation bookFlight(LocalDateTime creationDate, Flight flight, Seats seat,
                                  Airport destinationAirport, Airport sourceAirport, Customer customer, int numberOfSeats) throws Exception {

        if(numberOfSeats>flight.getAircraft().getSeats())
            throw new Exception("Not enough seats available");

        int remainingSeats = flight.getAircraft().getSeats() - numberOfSeats;
        flight.getAircraft().setSeats(remainingSeats);

        return  new Reservation(creationDate,destinationAirport,sourceAirport,flight,seat,customer);
    }



    public void setupSystem(){
        airports.add(jfkAirport);
        airports.add(heathrowAirport);
        airports.add(naritaAirport);

        flights.add(jfkToHeathrowFlight);
        flights.add(heathrowToNaritaFlight);
        flights.add(naritaToJfkFlight);
        dataGenerator.generateFlightMap(flights);
    }


    public void runSimulation(){
        String destination = "LHR";
        System.out.println("Searching for flights to " + destination + "...");
        List<Flight> foundFlights = dataGenerator.searchFlight(destination);

        if (foundFlights != null && !foundFlights.isEmpty()) {
            // Simulate a customer making a reservation
            Flight selectedFlight = foundFlights.get(0); // Assume the first found flight is selected
            Seats selectedSeat = new Seats(12, SeatCategory.REGULAR); // Assume a specific seat is selected
            Airport sourceAirport = jfkAirport;
            Airport destinationAirport = heathrowAirport;

            try {
                Reservation reservation = bookFlight(
                        LocalDateTime.now(),
                        selectedFlight,
                        selectedSeat,
                        destinationAirport,
                        sourceAirport,
                        aliceCustomer,
                        1 // Number of seats to book
                );

                // Reservation successful
                System.out.println("Reservation successful:");
                System.out.println(reservation);
            } catch (Exception e) {
                // Handle the exception, log it, or perform any necessary actions
                e.printStackTrace(); // This is a simple example; you might want to handle it more appropriately
            }
        } else {
            System.out.println("No flights found for the given destination.");
        }
    }

    public void runningAirlineSystem(){
        System.out.println("Start the Booking...");
        setupSystem();
        runSimulation();
    }
}
