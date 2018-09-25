package com.treandingstyle.DAOImp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.treandingstyle.model.CartItem;
import com.treandingstyle.model.CustomerOrder;
import com.treandingstyle.model.User;
import com.treandingstyle.DAO.CartItemDAO;
@Repository
@Transactional
public class CartDAOImp implements CartItemDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void addToCart(CartItem cartItem) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItem);
	}
	public User getUser(String email) {
	Session session=sessionFactory.getCurrentSession();
	User user=(User)session.get(User.class,email);
	return user;
}
public List<CartItem> getCart(String email) {
	Session session=sessionFactory.getCurrentSession();
	//SQL - select * from cartitem where user_email=?
	//cartItem has user, user has email
	Query query=session.createQuery("from CartItem where user.email='"+email+"'");
	//query.setString(0, email);
	List<CartItem> cartItem=query.list();
	return cartItem;
}
public void removeCartItem(int cartId) {
	Session session=sessionFactory.getCurrentSession();
	CartItem cartItem=(CartItem)session.get(CartItem.class, cartId);
	session.delete(cartItem);
	
	
}
public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
	Session session=sessionFactory.getCurrentSession();
	session.save(customerOrder);
	//customerOrder.user -> user obj
	//user -> customer -> updated shipping address
	 return customerOrder;
}
public void removeCart(int cartId) {
	// TODO Auto-generated method stub
	
}
}