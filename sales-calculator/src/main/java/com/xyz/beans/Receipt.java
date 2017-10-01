package com.xyz.beans;

import java.util.List;

import com.xyz.util.NoTaxableCategory;
import com.xyz.util.Utils;

public class Receipt {
	
	private double tax;
	
	private double totalReceipt;
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalReceipt() {
		return totalReceipt;
	}

	public void setTotalReceipt(double totalReceipt) {
		this.totalReceipt = totalReceipt;
	}

	public void printReceipt() {
		System.out.println("### Receipt ####");
		double salesTaxes = 0.0;
		
		for(Product product: products) {
			double totalProductTax = 0.0;
			double productTax = 0.0;
			double importedTax = 0.0;
			//check if apply tax
			if(isTaxable(product)) {
				productTax = Utils.roundingRule(Utils.calculateSalesTaxes(product));
				totalProductTax += productTax;
				salesTaxes += productTax;
			}
			//check if imported
			if(product.isImported()) {
				importedTax = Utils.roundingRule(Utils.calculateImportedSalesTaxes(product));
				totalProductTax += importedTax;
				salesTaxes += importedTax;
			}
			double price = product.getUnitPrice() + totalProductTax;
			System.out.printf("%d %s: %.2f\n",product.getQuantity(), product.getName(), + price);
			setTotalReceipt(totalReceipt + price);
		}
		System.out.printf("Sales Taxes: %.2f\n", salesTaxes);
		System.out.printf("Total: %.2f\n",getTotalReceipt());
		System.out.println("------------------------------");
	}
	
	/*
	 * Check if apply tax to the category of this product 
	 */
	private boolean isTaxable(Product p) {
		for (NoTaxableCategory ntc : NoTaxableCategory.values()) {
	        if (ntc.name().equals(p.getCategory())) {
	            return false;
	        }
	    }
	    return true;
	
	}
	
}
