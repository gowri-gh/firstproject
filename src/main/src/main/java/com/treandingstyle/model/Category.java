package com.treandingstyle.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Category
{
	@Id
	
	private	int categoryId;
	private	String categoryName;
	@OneToMany(mappedBy="category")
	private List<Product> products;

	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
		@Override
		public String toString() {
		  return this.categoryId + " " + this.categoryName;
	}
	
}