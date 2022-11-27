package com.company;

public class Customer {

    private String name;
    private String email;
    private int creditLimit;


    public Customer(){
        this("default", "default.com");
    }
    // this constructor calls the 2 parameter constructor below when then calls the 3 constructor parameter
    // this is what constructor chaining is

    public Customer(String name, String email) {
    this(name, email, 1000);
    }
    //this calls the 3 parameter constructor.
    // you can order them and call whichever ones you like, but in this case I chose least complete to most complete
    // in terms of parameters

    public Customer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
