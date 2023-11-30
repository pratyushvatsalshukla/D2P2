package org.example;

import java.util.HashMap;
import java.util.Map;

public class Shipping implements Payment {
    private Map<String, Double> map= new HashMap<>();
    
    public void addToCart(Customer customerDetails, double totalAmount){
        totalAmount+=totalAmount>=500?cashOnDelivery():0;
        map.put(customerDetails.getName(),totalAmount);
        System.out.println("Hi "+customerDetails.getName()+", "+" Your Bill is "+ totalAmount+"Rs");
        System.out.println("Your Delivery address Details are: "+customerDetails.getNumber()+" "+customerDetails.getAddress());
    }
    
    @Override
    public int cashOnDelivery() {
        System.out.println("Cash On Delivery Charges 50Rs. Applied");
        return 50;
    }
}