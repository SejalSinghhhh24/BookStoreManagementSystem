package com.nineleaps.bookstoremanagemnetsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.bookstoremanagemnetsystem.entity.Order;
import com.nineleaps.bookstoremanagemnetsystem.services.IOrderServices;

@RestController
public class OrderController {

	@Autowired
	private IOrderServices orderSevices;
	
	@GetMapping("/getallorderdetails")
	public List<Order> getAllOrder(){
		return orderSevices.getAllOrder();
	}
	
	@GetMapping("/getorderbyid/{orderid}")
	public Order getOrderById(@PathVariable(name="orderid") Long orderId) {
		return orderSevices.getOrderById(orderId);
	}
	
	
	@PostMapping("/insertorder")
	public Order insertOrder(Order newOrder) {
		return orderSevices.insertOrder(newOrder);
		
	}
	
}
