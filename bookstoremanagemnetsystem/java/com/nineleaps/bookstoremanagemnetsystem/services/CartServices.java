package com.nineleaps.bookstoremanagemnetsystem.services;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.entity.Cart;
import com.nineleaps.bookstoremanagemnetsystem.entity.Customer;
import com.nineleaps.bookstoremanagemnetsystem.entity.Order;
import com.nineleaps.bookstoremanagemnetsystem.entity.Payment;
import com.nineleaps.bookstoremanagemnetsystem.repository.CartRepository;
@Service

public class CartServices implements ICartServices {

	@Autowired
	private CartRepository cartRepository;
	
	
	
	
	@Autowired
	private ICustomerServices customerServices;
	
	@Autowired
	private IBookServices bookServices;
		
	@Autowired
	private IPaymentServices paymentServices;
	
	@Autowired		
	private IOrderServices orderServices;
	
	
//	@Override
//	public List<Cart> getAllCart() {
//		return cartRepository.findAll();
//	}
//
//	@Override
//	public Cart getCartById(Long cartId) {
//		return cartRepository.findById(cartId).get();
//	}
//
//	@Override
//	public void deleteCart(Long cartId) {
//		cartRepository.deleteById(cartId);
//	}
//
//	@Override
//	public Cart insertCart(Cart newCart) {
//		return cartRepository.save(newCart);
//	}

	//@Override
	public Long findByBookId(Long bookid,Long customerId) {
		
		Date date = new Date();
	    String strDateFormat = "hh:mm:ss a";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate= dateFormat.format(date);
	    
		Book book = bookServices.getBookById(bookid);
	    Long bookTotalQuantity=book.getBookTotalQuantity();
		Long bookPrice=book.getBookPrice();
		Long finalBookPrice=(long) (bookPrice*0.05+bookPrice);
		Customer customer=customerServices.getCustomerById(customerId);
		Long cartId = (long) (Math.random()*100);
		Cart cart=new Cart(cartId,finalBookPrice,book,customer);
		//Long cartIdMain=cart.getCartId();
		Payment payment=new Payment(cartId,"success",cart);
		//System.out.println(cartId);
		Order order=new Order(customerId,formattedDate,"show",payment,book);
		//payment.setPaymentStatus("success");
        Long walletAmt=customer.getCustomerWallet();
		if(walletAmt>finalBookPrice) {
			paymentServices.insertPayment(payment);
			orderServices.insertOrder(order);
			book.setBookTotalQuantity(bookTotalQuantity-1);
			bookServices.updateBook(bookid, book);
			Long updatedWalletAmt=walletAmt-finalBookPrice;
		if(updatedWalletAmt>0)
			customer.setCustomerWallet(updatedWalletAmt);
		
		else
			customer.setCustomerWallet(0l);
		}
		customerServices.insertCustomer(customer);
		
		return finalBookPrice;
	}
	
	
	

}
