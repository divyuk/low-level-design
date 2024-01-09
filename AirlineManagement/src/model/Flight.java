package model;

import java.time.LocalDateTime;
import java.util.Timer;

public class Flight {
    public String origin;
    public String destination;
    public Timer duration;
    public LocalDateTime departure;
    public LocalDateTime arrival;
    public Aircraft aircraft;
    public Flight(String origin, String destination, Timer duration, LocalDateTime departure, LocalDateTime arrival, Aircraft aircraft) {
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        this.departure = departure;
        this.arrival = arrival;
        this.aircraft = aircraft;
    }

    public String getDestination() {
        return destination;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }
}
