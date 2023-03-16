package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import com.nineleaps.bookstoremanagemnetsystem.entity.Payment;

public interface IPaymentServices {

	public String findByPaymentId(Long paymentId);
	public Payment insertPayment(Payment newPayment) ;
	public List<Payment> getAllPayment();
}

