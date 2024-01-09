package model;

import java.time.LocalDateTime;

public class Reservation {
    static int idCounter = 0; // Counter for reservation Number
    public String reservationNumber;
    public LocalDateTime creationDate;
    public Airport destination;
    public Airport sourceAirport;
    public Flight flight;
    public Seats seat;
    public Customer customer;

    public Reservation( LocalDateTime creationDate, Airport destination, Airport sourceAirport, Flight flight, Seats seat, Customer customer) {
        idCounter+=1;
        this.creationDate = creationDate;
        this.destination = destination;
        this.sourceAirport = sourceAirport;
        this.flight = flight;
        this.seat = seat;
        this.reservationNumber = String.valueOf(idCounter);
        this.customer = customer;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public Seats getSeat() {
        return seat;
    }
}
