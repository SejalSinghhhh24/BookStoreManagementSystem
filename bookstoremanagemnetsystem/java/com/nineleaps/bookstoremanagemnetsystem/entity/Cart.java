package com.nineleaps.bookstoremanagemnetsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartinfo")
public class Cart {
	@Id
	@Column(name="cartid",nullable = false)
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long cartId;
	@Column(name="carttotal",nullable = false)
	private Long cartTotal;
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Cart(Long cartId, Long cartTotal, Book book, Customer customer) {
		super();
		this.cartId = cartId;
		this.cartTotal = cartTotal;
		this.book = book;
		this.customer = customer;
	}
	public Cart(Long cartTotal, Book book, Customer customer) {
		super();
		this.cartTotal = cartTotal;
		this.book = book;
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="book_id")
	private Book book;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public Cart(Long cartId, Long cartTotal) {
		super();
		this.cartId = cartId;
		this.cartTotal = cartTotal;
	}
	public Cart(Long cartTotal) {
		super();
		this.cartTotal = cartTotal;
	}
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public Long getCartTotal() {
		return cartTotal;
	}
	public void setCartTotal(Long cartTotal) {
		this.cartTotal = cartTotal;
	}
	
}
