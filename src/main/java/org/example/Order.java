package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order extends Shipping{
    private List<Product> products = new ArrayList<>();
    private List<String> productsName = new ArrayList<>();
    private double totalAmount;
    
    public void addProduct(Product product) {
        productsName.add(product.getName());
        products.add(product);
        totalAmount += product.getPrice();
    }
    
    public void checkout(Customer customerDetails) {
        //Perform order processing, payment, and shipping logic here
    	System.out.println("***Welcome to MyMarketPlace***");
        System.out.print("Total Bill of : ");
        System.out.println(productsName);
        //****Open-Closed Principle****
        addToCart(customerDetails,totalAmount);
        System.out.println("Order processed successfully. Thank you for your order.");
    }
}