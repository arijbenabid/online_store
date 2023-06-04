
package com.myproducts;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.myproducts.BookProduct;
import com.myproducts.ClothingProduct;
import com.myproducts.ElectronicProduct;
import com.myproducts.Order;
import com.myproducts.Product;


public class App {
   
    public static  void main(String[] args) throws Exception {
      Order order = new Order();
       ElectronicProduct myElectronicProduct = new ElectronicProduct("Printer", 775.0, "1542",8.0);
       BookProduct myBookProduct = new BookProduct("Java for beginners", 55.99, "10568", "Jason Stone ");
       ClothingProduct myClothingProduct = new ClothingProduct("Pants", 39.99, "7568","Large");
       System.out.println(myElectronicProduct.getDescription()); 
       System.out.println(myBookProduct.getDescription()); 
       System.out.println(myClothingProduct.getDescription()); 

      order.addProduct(myElectronicProduct);
      order.addProduct(myBookProduct);
      order.addProduct(myClothingProduct);

      System.out.println("Product list");
      for (Product p : order.products){
        System.out.println(p.getDescription());
      }
      order.removeProduct(myClothingProduct);
      System.out.println("Clothing product deleted successfully");



      double total = order.total();
      System.out.println("total: $"+ total);

      System.out.println("the new product list :");
      for (Product p : order.products){
        System.out.println(p.getDescription());
      }

  

    }
}
