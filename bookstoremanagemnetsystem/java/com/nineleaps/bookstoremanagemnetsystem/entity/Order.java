package com.nineleaps.bookstoremanagemnetsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderinfo")
public class Order {

	@Id
	@Column(name="orderid")
	private Long orderId;
	@Column(name="orderdate",nullable = false)
	private String orderDate;
	@Column(name="orderstatus",nullable = false)
	private String orderStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="payment_id")
	private Payment payment;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="book_id")
	private Book book;
	
	public Order(Long orderId, String orderDate, String orderStatus, Payment payment, Book book) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.payment = payment;
		this.book = book;
	}
//	public Book getBook() {
//		return book;
//	}
//	public void setBook(Book book) {
//		this.book = book;
//	}
	public Order(Long orderId, String orderDate, String orderStatus, Payment payment) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.payment = payment;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long orderId, String orderDate, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
