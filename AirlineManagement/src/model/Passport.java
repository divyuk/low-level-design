package model;

public class Passport {
    String passportNumber;
    String dob;
    String expiryDate;
    Address address;

    public Passport(String passportNumber, String dob, String expiryDate, Address address) {
        this.passportNumber = passportNumber;
        this.dob = dob;
        this.expiryDate = expiryDate;
        this.address = address;
    }
}
