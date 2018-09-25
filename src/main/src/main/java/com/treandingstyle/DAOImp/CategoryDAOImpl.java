package com.treandingstyle.DAOImp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.treandingstyle.DAO.CategoryDAO;
import com.treandingstyle.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO
{
@Autowired
SessionFactory sessionFactory;
public List<Category> findAllCategorys() {
	return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

public Category findCategoryById(int CategoryId) {
	return (Category)sessionFactory.getCurrentSession().createQuery("from Category where CategoryId="+CategoryId).uniqueResult();

	}

public Category findCategoryByName(String CategoryName) {
	return (Category)sessionFactory.getCurrentSession().createQuery("from Category where CategoryName='"+CategoryName+"'").uniqueResult();

	}

public boolean addCategory(Category Category) {
	sessionFactory.getCurrentSession().save(Category);
	return true;
	}

public boolean updateCategory(Category Category) {
	sessionFactory.getCurrentSession().update(Category);
	return true;
	}

public boolean deleteCategory(int CategoryId) {
	sessionFactory.getCurrentSession().delete(findCategoryById(CategoryId));	
	return true;
	}


}