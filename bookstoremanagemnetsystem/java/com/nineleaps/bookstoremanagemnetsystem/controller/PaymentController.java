package com.nineleaps.bookstoremanagemnetsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.entity.Payment;
import com.nineleaps.bookstoremanagemnetsystem.services.IPaymentServices;

@RestController
public class PaymentController {

	@Autowired
	private IPaymentServices paymentservices;
	
	@GetMapping("/paymentstatus/{paymentid}")
	public String findByPaymentId(@PathVariable(name="paymentid") Long paymentId) {
		return paymentservices.findByPaymentId(paymentId);
		
	}
	@GetMapping("/getallpayments")
	public List<Payment> getAllPayment(){
		return paymentservices.getAllPayment();
	}
}
