package com.treandingstyle.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.treandingstyle.DAO.CategoryDAO;
import com.treandingstyle.DBConfig.DBConfig;
import com.treandingstyle.model.Category;

import junit.framework.TestCase;

public class CategoryDAOImpltest extends TestCase {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	Category category=new Category();
	public void testFindAllCategories() {
		List<Category>categoryList=categoryDAO.findAllCategorys();
		assertNotNull(categoryList);	
	}

	public void testFindCategoryById() {
		Category category1=categoryDAO.findCategoryById(2);
		assertNotNull(category1);
		category1.getCategoryName();
		
	int expectedId=20;
	int actualId=category1.getCategoryId();
		assertTrue(expectedId==actualId);		
	}

	public void testFindCategoryByName() {
		Category category2 =categoryDAO.findCategoryByName("glass");
		assertNotNull(category2);
		category2.getCategoryId();
		
		String expectedName="glass";
		String actualName=category2.getCategoryName();
		assertTrue(expectedName.equals(actualName));	
	}

	public void testAddCategory() {
		Category category=new Category();
		category.setCategoryId(21);
		category.setCategoryName("earrings");
		
		//boolean result1 = userDAO.addUser(user1);
		assertEquals(true,categoryDAO.addCategory(category));		
	}

	public void testUpdateCategory() {
		Category category3=categoryDAO.findCategoryById(21);
		category3.setCategoryName("Gifts");
		
		categoryDAO.updateCategory(category3);
		assertTrue(category3.getCategoryName()=="glass");
		
	}

	public void testDeleteCategory() {
		Category category4=categoryDAO.findCategoryById(21);
		category4.getCategoryName();
		
		assertEquals(true,categoryDAO.deleteCategory(category4.getCategoryId()));
	
	}

}
