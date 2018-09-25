package com.treandingstyle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CartItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int cartId;
	@ManyToOne
private Product product;
	@ManyToOne
private User user;
private int quantity;
private double totalPrice;
public int getCartId() {
	return cartId;
}
public void setCartId(int CartId) {
	this.cartId = cartId;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

}
