package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;

@Service
public class ShipmentService extends OrderService{
	
	private double total;
	
	public ShipmentService(Order order) {
		super(order);
		
	}
	
	@Override
	protected double total() {
		this.total=super.total();
		return this.total;
	}
	
	public double shipTotal() {
		double t = total();
		if(t<100.0) {
			return t + 20.0;
		}else if(t>=100 || t<200) {
			return t + 12.0;
		}else {
			return t;
		}
			
	}
	
	
}
