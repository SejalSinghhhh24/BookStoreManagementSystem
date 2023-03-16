package com.nineleaps.bookstoremanagemnetsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.entity.Customer;
import com.nineleaps.bookstoremanagemnetsystem.services.IBookServices;
import com.nineleaps.bookstoremanagemnetsystem.services.ICustomerServices;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerServices customerServices;
	
	@Autowired
	private IBookServices bookService;
	
//	@GetMapping("/getallcustomer")
//	public List<Customer> getAllCustomer(){
//		return customerServices.getAllCustomer();
//		
//	}
	@GetMapping("/getcustomerbyid/{custid}")
	public Customer getCustomerById(@PathVariable(name="custid") Long customerId) {
		return customerServices.getCustomerById(customerId);
		
	}
//	@DeleteMapping("/deletecustomer/{custid}")
//	public void deleteCustomer(@PathVariable(name="custid")Long customerId) {
//		customerServices.deleteCustomer(customerId);
//	}
	@PostMapping("/insertcustomer")
	public Customer insertCustomer(@RequestBody Customer newCustomer) {
		return customerServices.insertCustomer(newCustomer);
		
	}
//	@PatchMapping("/updatecustomer/{custid}")
//	public String updateCustomer(@PathVariable(name="custid")Long customerId,@RequestBody Customer updatedCustomer) {
//		return customerServices.updateCustomer(customerId, updatedCustomer);
//		
//	}
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("findbybookname/{bookname}")
	//custom methods
	public Book findByBookName(@PathVariable(name="bookname")String bookName) {
		return bookService.findByBookName(bookName);
		
	}
	
//	//custom methods
//	@GetMapping("/findbycustomername/{custname}")
//	public Customer findByCustomerName(@PathVariable(name="custname")String customerUserName) {
//		return customerServices.findByCustomerName(customerUserName);
//		
//	}
	
	@GetMapping("/validate/{custname}/{custpassword}")
	public String findByAdminUserNameAndAdminPassword(String customerUserName, String customerPassword) {
		return customerServices.findByAdminUserNameAndAdminPassword(customerUserName, customerPassword);
	}
	
	
}
