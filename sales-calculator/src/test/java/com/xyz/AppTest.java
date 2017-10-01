package com.xyz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.xyz.beans.Product;
import com.xyz.beans.Receipt;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
   @Test
   public void testReceipe() {
   	//Basket #1
       Product p1 = new Product();
       p1.setCategory("BOOKS");
       p1.setName("book");
       p1.setQuantity(1);
       p1.setUnitPrice(12.49);
       p1.setImported(false);

       Product p2 = new Product();
       p2.setCategory("MUSIC");
       p2.setName("music CD");
       p2.setQuantity(1);
       p2.setUnitPrice(14.99);
       p2.setImported(false);
       
       Product p3 = new Product();
       p3.setCategory("FOOD");
       p3.setName("chocolate bar");
       p3.setQuantity(1);
       p3.setUnitPrice(0.85);
       p3.setImported(false);
       
       List<Product> products = new ArrayList<Product>();
       products.add(p1);
       products.add(p2);
       products.add(p3);
       
       Receipt receipt = new Receipt();
       receipt.setProducts(products);
       receipt.printReceipt();
       
       //Basket #2
       receipt.setProducts(null);
       p1 = new Product();
       p1.setCategory("FOOD");
       p1.setName("box of chocolates");
       p1.setQuantity(1);
       p1.setUnitPrice(10.00);
       p1.setImported(true);
       
       p2 = new Product();
       p2.setCategory("PERFUME");
       p2.setName("bottle of perfume");
       p2.setQuantity(1);
       p2.setUnitPrice(47.50);
       p2.setImported(true);
       
       products = new ArrayList<Product>();
       products.add(p1);
       products.add(p2);
       
       receipt = new Receipt();
       receipt.setProducts(products);
       receipt.printReceipt();
   	
   	//Basket #3
       receipt.setProducts(null);
       p1 = new Product();
       p1.setCategory("PERFUME");
       p1.setName("bottle of perfume");
       p1.setQuantity(1);
       p1.setUnitPrice(27.99);
       p1.setImported(true);

       p2 = new Product();
       p2.setCategory("PERFUME");
       p2.setName("bottle of perfume ");
       p2.setQuantity(1);
       p2.setUnitPrice(18.99);
       p2.setImported(false);
     
       p3 = new Product();
       p3.setCategory("MEDICAL_PRODUCT");
       p3.setName("packet of headache pills");
       p3.setQuantity(1);
       p3.setUnitPrice(9.75);
       p3.setImported(false);

       Product p4 = new Product();
       p4.setCategory("FOOD");	
       p4.setName("box of imported chocolates");
       p4.setQuantity(1);
       p4.setUnitPrice(11.25);
       p4.setImported(true);

       products = new ArrayList<Product>();
       products.add(p1);
       products.add(p2);
       products.add(p3);
       products.add(p4);
       receipt = new Receipt();
       receipt.setProducts(products);
       receipt.printReceipt(); 	   
   }
}
