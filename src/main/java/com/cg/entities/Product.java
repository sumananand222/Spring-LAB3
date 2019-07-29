package com.cg.entities;

public class Product {
	private Integer prodId;
	private String prodName;
	private Double prodPrice;

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + prodId + ", ProductName=" + prodName + ", ProductPrice=" + prodPrice + "]";
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getProdPrice() {
		return prodPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer prodId, String prodName, Double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}
}
