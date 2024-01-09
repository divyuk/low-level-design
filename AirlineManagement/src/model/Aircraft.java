package model;

public class Aircraft {
    String name;
    String model;
    int seats;
    String manufacturingYear;

    public Aircraft(String name, String model, int seats, String manufacturingYear) {
        this.name = name;
        this.model = model;
        this.seats = seats;
        this.manufacturingYear = manufacturingYear;
    }
}
