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

import com.nineleaps.bookstoremanagemnetsystem.entity.Admin;
import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.entity.Customer;
import com.nineleaps.bookstoremanagemnetsystem.services.IAdminServices;
import com.nineleaps.bookstoremanagemnetsystem.services.IBookServices;
import com.nineleaps.bookstoremanagemnetsystem.services.ICustomerServices;
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private IAdminServices adminServices;
	
	@Autowired
	private IBookServices bookService;
	
	@Autowired
	private ICustomerServices customerServices;
	
	@GetMapping("/getalladmins")
	public List<Admin> getAllAdmins(){
		return adminServices.getAllAdmins();
		
	}
	
	@GetMapping("/getadminbyid/{adminid}")
	public Admin getAdminById(@PathVariable(name="adminid") Long adminId) {
		return adminServices.getAdminById(adminId);
		
	}
	
	@DeleteMapping("/deleteadmin/{adminid}")
	public void deleteAdmin(@PathVariable(name="adminid") Long adminId) {
		adminServices.deleteAdmin(adminId);
	}
	
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@RequestBody Admin newAdmin) {
		return adminServices.insertAdmin(newAdmin);
	}
	
	@PatchMapping("/updateadmin/{adminid}")
	public String updateAdmin(@PathVariable(name="adminid")Long adminId,@RequestBody Admin updatedAdmin) {
		return adminServices.updateAdmin(adminId, updatedAdmin);
	}
	
	
	//custom methods
	@GetMapping("/validateadmin/{adminusername}")
	public Admin findByAdminUserName(@PathVariable(name="adminusername")String adminUserName) {
		return adminServices.findByAdminUserName(adminUserName);
	}
	
	@GetMapping("/validateadmin/{adminusername}/{adminuserpassword}")
	public String findByAdminUserNameAndAdminPassword(@PathVariable(name="adminusername")String adminUserName,@PathVariable(name="adminuserpassword") String adminPassword) {
		return adminServices.findByAdminUserNameAndAdminPassword(adminUserName, adminPassword);
	}
	
	@GetMapping("/getbookbyid/{bookid}")
	public Book getBookById(@PathVariable(name="bookid") Long bookId) {
		return bookService.getBookById(bookId);
	}
	

	@DeleteMapping("/deletebookbyid/{bookid}")
	public void deleteBook(@PathVariable(name="bookid")Long bookId) {
		bookService.deleteBook(bookId);
	}
	
	@PostMapping("/insertbooks")
	public Book insertBook(@RequestBody Book newBook) {
		return bookService.insertBook(newBook);
		
	}
	
	@PatchMapping("/updatebooks/{bookid}")
	public Book updateBook(@PathVariable(name="bookid")Long bookId,@RequestBody Book updatedBook) {
		return bookService.updateBook(bookId, updatedBook);
		
	}
	
	@GetMapping("/getcustomerbyid/{custid}")
	public Customer getCustomerById(@PathVariable(name="custid") Long customerId) {
		return customerServices.getCustomerById(customerId);
		
	}
	@DeleteMapping("/deletecustomer/{custid}")
	public void deleteCustomer(@PathVariable(name="custid")Long customerId) {
		customerServices.deleteCustomer(customerId);
	}
	
	@GetMapping("/getallcustomer")
	public List<Customer> getAllCustomer(){
		return customerServices.getAllCustomer();
		
	}
	
	@PatchMapping("/updatecustomer/{custid}")
	public String updateCustomer(@PathVariable(name="custid")Long customerId,@RequestBody Customer updatedCustomer) {
		return customerServices.updateCustomer(customerId, updatedCustomer);
		
	}
	
	//custom methods
		@GetMapping("/findbycustomername/{custname}")
		public Customer findByCustomerName(@PathVariable(name="custname")String customerUserName) {
			return customerServices.findByCustomerName(customerUserName);
			
		}
}
