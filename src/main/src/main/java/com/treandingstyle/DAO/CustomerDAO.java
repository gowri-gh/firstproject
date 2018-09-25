package com.treandingstyle.DAO;

import com.treandingstyle.model.Customer;

public interface CustomerDAO {
	public void registerCustomer(Customer customer);
	public boolean isEmailUnique(String email);
}
