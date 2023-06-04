package com.myproducts;

import java.util.ArrayList;


public class Order implements Cart {
    public ArrayList<Product> products ; 




    public Order() {
         products = new ArrayList<Product>();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product) ;
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
        
    }

    @Override
    public double total() {
    double totalPrice=0; 
    for (Product product : products){
        totalPrice +=   product.getPrice(); 
    }
    return totalPrice;
    }

    
}