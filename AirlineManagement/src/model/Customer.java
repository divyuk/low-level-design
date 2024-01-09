package model;

public class Customer extends  Account {
    boolean isFrequentFlyer;

    public Customer(String id, String name, String email, String password, String phone, Passport passport) {
        super(id, name, email, password, phone, passport);
    }

    // Overloaded Constructor
    public Customer(String id, String name, String email, String password, String phone, Passport passport, boolean isFrequentFlyer) {
        super(id, name, email, password, phone, passport);
        this.isFrequentFlyer = isFrequentFlyer;
    }
}
