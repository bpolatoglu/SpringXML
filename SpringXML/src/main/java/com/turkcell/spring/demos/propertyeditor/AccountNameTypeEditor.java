package com.turkcell.spring.demos.propertyeditor;

import java.beans.PropertyEditorSupport;

public class AccountNameTypeEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) {
		setValue(new AccountNameType(text.toUpperCase()));
	}

}
