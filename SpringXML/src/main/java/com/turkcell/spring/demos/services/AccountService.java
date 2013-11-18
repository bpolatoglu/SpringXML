package com.turkcell.spring.demos.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.turkcell.spring.demos.dao.AccountDAO;

public class AccountService implements ApplicationContextAware {

	private String accountDAOBeanName;
	private AccountDAO accountDAO;
	private ApplicationContext applicationContext;
	
	@SuppressWarnings("unused")
	private void init() {
		accountDAO = (AccountDAO) applicationContext.getBean(accountDAOBeanName);
		System.out.println("starting accountService... with AcccountDAO = " + accountDAO);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void setAccountDAOBeanName(String accountDAOBeanName) {
		this.accountDAOBeanName = accountDAOBeanName;
	}
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("this is account service & tableName:").append(accountDAO.getTableName()).toString();
	}
}
