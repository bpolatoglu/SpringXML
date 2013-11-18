package com.turkcell.spring.demos.services;

import com.sun.org.apache.xml.internal.security.Init;
import com.turkcell.spring.demos.dao.BankDAO;
import com.turkcell.spring.demos.dao.CustomerDAO;

public class BankService {

	private BankDAO bankDAO;
	private CustomerDAO customerDAO;

	public BankService(BankDAO bankDAO, CustomerDAO customerDAO) {
		this.bankDAO = bankDAO;
		this.setCustomerDAO(customerDAO);
	}
	
	@Override
	public String toString() {
		return new StringBuilder("this is bank service & tableName:").append(bankDAO.getTableName()).toString();
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	
	@SuppressWarnings("unused")
	private void init() {
		System.out.println("starting BankService..");
	}
}
