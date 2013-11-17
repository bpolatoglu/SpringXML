package com.turkcell.spring.demos.bean;

import java.util.HashSet;
import java.util.Set;

public class Bank {

	private String name;
	private Set<Customer> customers = new HashSet<Customer>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
}
