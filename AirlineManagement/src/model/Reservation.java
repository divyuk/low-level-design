package model;

import java.time.LocalDateTime;

public class Reservation {
    String reservationNumber;
    LocalDateTime creationDate;
    Airport destination;
    Airport sourceAirport;
    Flight flight;
    Seats seat;

    public Reservation(String reservationNumber, LocalDateTime creationDate, Airport destination, Airport sourceAirport, Flight flight, Seats seat) {
        this.reservationNumber = reservationNumber;
        this.creationDate = creationDate;
        this.destination = destination;
        this.sourceAirport = sourceAirport;
        this.flight = flight;
        this.seat = seat;
    }
}
