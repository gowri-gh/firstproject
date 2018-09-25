package com.treandingstyle.DAO;

import java.util.List;

import com.treandingstyle.model.Category;
import com.treandingstyle.model.Product;



	public interface ProductDAO {
		public List<Product> findAllProducts();
		public Product findProductById(int ProductId);
		public Product findProductByName(String ProductName);
		public boolean addProduct(Product product);
		public boolean updateProduct(Product product);
		public boolean deleteProduct(int productId);
		List<Category> findAllCategories();
		Product getProduct(int id);
		}

	


