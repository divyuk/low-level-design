package model;

import java.time.LocalDateTime;
import java.util.Timer;

public class Flight {
    String origin;
    String destination;
    Timer duration;
    LocalDateTime departure;
    LocalDateTime arrival;
    public Flight(String origin, String destination, Timer duration, LocalDateTime departure, LocalDateTime arrival) {
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        this.departure = departure;
        this.arrival = arrival;
    }

}
