package com.qiaohk.po;

public class ProductsCustom extends Products {
	
	private Integer id;
	
	private Products products;
	
	private Number number;
		
	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	
	

}
