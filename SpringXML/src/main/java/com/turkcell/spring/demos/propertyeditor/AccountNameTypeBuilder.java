package com.turkcell.spring.demos.propertyeditor;

public class AccountNameTypeBuilder {

	private AccountNameType accountNameType;

	public void setAccountNameType(AccountNameType accountNameType) {
		this.accountNameType = accountNameType;
	}
	
	public AccountNameType getAccountNameType() {
		System.out.println(accountNameType.getAccountName());
		return accountNameType;
	}
	
}
