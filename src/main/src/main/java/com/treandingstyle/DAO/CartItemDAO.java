package com.treandingstyle.DAO;

import java.util.List;

import com.treandingstyle.model.CartItem;
import com.treandingstyle.model.CustomerOrder;
import com.treandingstyle.model.User;

public interface CartItemDAO {
	void addToCart(CartItem cart);
	User getUser(String email);
	List<CartItem>  getCart(String email);//select * from cart where user_email=?
	void removeCart(int cartId);
	CustomerOrder createCustomerOrder(CustomerOrder customerOrder);
}
