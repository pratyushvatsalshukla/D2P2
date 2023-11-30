package org.example;

public class Customer {
    private String customerName;
    private String customerNumber;
    private String customerAddress;

    public Customer(String name, String number, String address){
        this.customerName = name;
        this.customerNumber = number;
        this.customerAddress = address;
    }
    public String getName() {
        return customerName;
    }
    public String getNumber() {
        return customerNumber;
    }
    public String getAddress() {
        return customerAddress;
    }
}