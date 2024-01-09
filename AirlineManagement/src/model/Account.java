package model;

import enums.AccountStatus;

public class Account {
    public String id;
    public String name;
    public String email;
    public String password;
    public String phone;
    public AccountStatus status;
    public Passport passport;

    public Account(String id, String name, String email, String password, String phone, Passport passport) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.passport = passport;
    }
}
