package com.treandingstyle.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.treandingstyle.DAO.UserDAO;
import com.treandingstyle.DBConfig.DBConfig;
import com.treandingstyle.model.User;

import junit.framework.TestCase;

public class UserDAOImpltest extends TestCase {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	
	User user1=new User();
	public void testAddUser() {
		User user=new User();
	
	
		user.setEmail("hhh@email.com");
		user.setPassword("pass");
		
		boolean result1 = userDAO.addUser(user1);
		assertEquals(true,userDAO.addUser(user));
	}
	

	public void testFindAllUsers() {
	List<User>userList=userDAO.findAllUsers();
	assertNotNull(userList);
		
	}
	public void testFindUserById() {
		User user1=userDAO.findUserById(102);
		assertNotNull(user1);
		user1.getUserName();
		user1.getEmail();
		user1.getPassword();
		user1.getPhoneNumber();
	int expectedId=22;
	int actualId=user1.getUserId();
		assertTrue(expectedId==actualId);
	}
			
	public void testFindUserByName() {
		
		User user2 = userDAO.findUserByName("imran");
		assertNotNull(user2);
		user2.getUserName();
		user2.getEmail();
		user2.getPassword();
		user2.getPhoneNumber();
		String expectedName="imran";
		String actualName=user2.getUserName();
		assertTrue(expectedName.equals(actualName));
		
		
	}

	public void testUpdateUser() {
		User user3=userDAO.findUserById(102);
		user3.setPhoneNumber("99020393");
		user3.setPassword("note");
		userDAO.updateUser(user3);
		userDAO.updateUser(user3);
		assertTrue(user3.getPhoneNumber()=="99020393");
		assertTrue(user3.getPassword()=="note");
		
	}

	public void testDeleteUser() {
	User user4=userDAO.findUserById(17);
	user4.getUserName();
	user4.getEmail();
	user4.getPassword();
	user4.getPhoneNumber();
	assertEquals(true,userDAO.deleteUser(user4.getUserId()));

	}
}