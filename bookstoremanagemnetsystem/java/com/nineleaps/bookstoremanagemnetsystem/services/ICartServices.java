package com.nineleaps.bookstoremanagemnetsystem.services;

import com.nineleaps.bookstoremanagemnetsystem.entity.Cart;


public interface ICartServices {
//	public List<Cart> getAllCart();
//	public Cart getCartById(Long cartId);
//	public void deleteCart(Long cartId);
	//public Cart insertCart(Cart newCart);
	//custom
	public Long findByBookId(Long bookid,Long customerId);
}
