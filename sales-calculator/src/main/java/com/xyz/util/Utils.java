package com.xyz.util;

import com.xyz.beans.Product;

public class Utils {
	public static final int TAX_RATE = 10;
	public static final int TAX_RATE_IMPORTED_GOOD = 5;

	
	public static double calculateSalesTaxes(Product product) {
		return (product.getUnitPrice() * TAX_RATE)/100;
	}
	
	public static double calculateImportedSalesTaxes(Product product) {
		return (product.getUnitPrice() * TAX_RATE_IMPORTED_GOOD)/100;
	}

	/*
	 * The rounding rules for sales tax are that for a tax rate of n%, 
	 * a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax
	 */
	public static double roundingRule(double price) {
		return Math.round(price * 20) / 20.0;
	}

}
