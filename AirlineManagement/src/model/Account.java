package model;

import enums.AccountStatus;

public class Account {
    String id;
    String name;
    String email;
    String password;
    String phone;
    AccountStatus status;

    public Account(String id, String name, String email, String password, String phone, AccountStatus status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.status = status;
    }
}
