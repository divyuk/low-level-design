package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    Spot spot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    public Ticket(Vehicle vehicle, Spot spot) {
        this.ticketId = "T-" + UUID.randomUUID();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

}
