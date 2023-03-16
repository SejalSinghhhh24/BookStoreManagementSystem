package com.nineleaps.bookstoremanagemnetsystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.nineleaps.bookstoremanagemnetsystem.services.ICartServices;


@RestController

public class CartController {
	
	@Autowired
	private ICartServices cartServices;
	
	
	
//	private Book book=new Book();
//	
//	@GetMapping("/getallitems")
//	public List<Cart> getAllCart(){
//		return cartServices.getAllCart();
//		
//	}
//	
//	@GetMapping("/getallitems/{cartid}")
//	public Cart getCartById(@PathVariable(name="cartid") Long cartId) {
//		return cartServices.getCartById(cartId);
//		
//	}
//	
//	@DeleteMapping("/deleteitem/{cartid}")
//	public void deleteCart(@PathVariable(name="cartid")Long cartId) {
//		cartServices.deleteCart(cartId);
//	}
//	
//	@PostMapping("/insertitems")
//	public Cart insertCart(@RequestBody Cart newCart) {
//		return cartServices.insertCart(newCart);
//		
//	}
	
	@GetMapping("/findcarttotal/{bookid}/{customerid}")
	public Long findByBook(@PathVariable(name="bookid")Long bookId,@PathVariable(name="customerid")Long customerId) {
		return cartServices.findByBookId(bookId,customerId);
		
	}
	
	
	
	
}
