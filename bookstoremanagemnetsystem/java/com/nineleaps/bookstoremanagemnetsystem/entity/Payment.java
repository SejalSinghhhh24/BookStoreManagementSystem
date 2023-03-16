package com.nineleaps.bookstoremanagemnetsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="paymentinfo")
public class Payment {

	@Id
	@Column(name="paymentid")
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long paymentId;
	@Column(name="paymentstatus",nullable = false)
	private String paymentStatus;
	
	
	
	public Payment(String paymentStatus) {
		super();
		this.paymentStatus = paymentStatus;
	}
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="cart_id")
	private Cart cart;
	public Payment(Long paymentId, String paymentStatus, Cart cart) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.cart = cart;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(Long paymentId, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
