package com.nineleaps.bookstoremanagemnetsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.bookstoremanagemnetsystem.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	public Payment findByPaymentId(Long paymentId);
}
