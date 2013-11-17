package com.turkcell.spring.demos.services;

import com.turkcell.spring.demos.dao.AccountDAO;
import com.turkcell.spring.demos.dao.CustomerDAO;

public class CustomerService {

	private CustomerDAO customerDAO;
	private AccountDAO accountDAO;
	
	private boolean isAvailable;
	
	@SuppressWarnings("unused")
	private void init() {
		System.out.println("starting customerService..");
	}
	
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}
	

	@Override
	public String toString() {
		return new StringBuilder("this is customer service:").append(customerDAO.getTableName()).append(" & isAvailable:").append(isAvailable).toString();
	}
}
