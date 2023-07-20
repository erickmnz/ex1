package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;

@Service
public class OrderService {
	private Order order;

	public OrderService(Order order) {
		super();
		this.order = order;
	}
	
	protected double total() {
		double price = this.order.getPrice();
		double discount = this.order.getDiscount()/100;
		return price-(price*discount);
	}
}
