package model;

import enums.AccountStatus;

import java.util.ArrayList;
import java.util.List;

public class Staff extends Account{
/*Staff manages all the flights and aircrafts*/
    private List<Aircraft> aircrafts;
    private List<Flight>flights;

    public Staff(String id, String name, String email, String password, String phone, Passport passport){
        super(id,name,email,password,phone, passport);
        this.aircrafts = new ArrayList<>();
        this.flights = new ArrayList<>();
    }
    void addAircraft(Aircraft aircraft){
        this.aircrafts.add(aircraft);
    }
    void addFlight(Flight flight){
        this.flights.add(flight);
    }
}
