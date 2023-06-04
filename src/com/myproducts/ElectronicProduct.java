package com.myproducts;



public class ElectronicProduct extends Product {


    private double power ; 
     

    public ElectronicProduct(String name, double price, String refrence, double power) {
        super(name, price, refrence);
        this.power = power;
    }

    public double getPower() {
        return power;
    }
    

    public void setPower(double power) {
        this.power = power;
    }








    public ElectronicProduct(String name, double price, String refrence) {
        super(name, price, refrence);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        return " name= "+ name + " price= " + price + " refrence= " + refrence + " and power "+ power ;
        // TODO Auto-generated method stub
    }


    
}