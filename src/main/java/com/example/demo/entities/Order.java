package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int code;
	private double price;
	private double discount;
	
	public Order() {}
	public Order(int code, double price, double discount) {
		super();
		this.code = code;
		this.price = price;
		this.discount = discount;
	}

	public int getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}
	
	
}
