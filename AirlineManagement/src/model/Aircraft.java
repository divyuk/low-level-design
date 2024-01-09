package model;

public class Aircraft {
    public String name;
    public String model;
    public int seats;
    public String manufacturingYear;

    public Aircraft(String name, String model, int seats, String manufacturingYear) {
        this.name = name;
        this.model = model;
        this.seats = seats;
        this.manufacturingYear = manufacturingYear;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

}
