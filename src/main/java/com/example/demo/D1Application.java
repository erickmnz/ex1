package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Order;
import com.example.demo.services.OrderService;
import com.example.demo.services.ShipmentService;

@SpringBootApplication
public class D1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(D1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order or1 = new Order(1034,150.0,20.0);
		double ss = new ShipmentService(or1).shipTotal();
		
		System.out.println(" codigo: "+or1.getCode()+"\n total:"+ss);
	}

}
