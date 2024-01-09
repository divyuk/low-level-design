package model;

import enums.SeatCategory;

public class Seats {
    int seatNumber;
    SeatCategory seatCategory;

    public Seats(int seatNumber, SeatCategory seatCategory) {
        this.seatNumber = seatNumber;
        this.seatCategory = seatCategory;
    }
}
