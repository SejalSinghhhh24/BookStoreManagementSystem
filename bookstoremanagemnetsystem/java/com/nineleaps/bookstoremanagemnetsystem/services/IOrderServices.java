package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import com.nineleaps.bookstoremanagemnetsystem.entity.Order;

public interface IOrderServices {

	public List<Order> getAllOrder();
	public Order getOrderById(Long orderId);
	public Order insertOrder(Order newOrder) ;
	
}
