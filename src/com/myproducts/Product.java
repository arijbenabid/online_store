package com.myproducts;



public abstract class Product {
    protected String name ; 

    protected double price ;
    protected String refrence ;
    public Product(String name, double price, String refrence) {
        this.name = name;
        this.price = price;
        this.refrence = refrence;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getRefrence() {
        return refrence;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRefrence(String refrence) {
        this.refrence = refrence;
    }
   
    public abstract String getDescription() ;

    
    

    
}