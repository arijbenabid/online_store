package com.myproducts;

public class ClothingProduct extends Product {
    private String size ;

    public ClothingProduct(String name, double price, String refrence,String size) {
        super(name, price, refrence);
        this.size = size ; 
        //TODO Auto-generated constructor stub
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return " name="+ name + " price=" + price + " refrence= " + refrence + " and size="+ size ;
    }
    
}