package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import com.nineleaps.bookstoremanagemnetsystem.entity.Customer;


public interface ICustomerServices  {
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(Long customerId);
	public void deleteCustomer(Long customerId);
	public Customer insertCustomer(Customer newCustomer);
	public String updateCustomer(Long customerId,Customer updatedCustomer);
	//custom methods
	public Customer findByCustomerName(String customerUserName);
	public String findByAdminUserNameAndAdminPassword(String customerUserName, String customerPassword) ;
}
