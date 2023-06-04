package com.myproducts;

public class BookProduct extends Product{
    private String author ; 

    public BookProduct(String name, double price, String refrence,String author) {
        super(name, price, refrence);
        this.author=author;
        //TODO Auto-generated constructor stub
    }
    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }
    

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return " name="+ name + " price=" + price + " refrence= " + refrence + " and author="+ author ;
    }


   
    
    
}