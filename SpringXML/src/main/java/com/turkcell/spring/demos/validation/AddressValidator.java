package com.turkcell.spring.demos.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.turkcell.spring.demos.bean.Address;

public class AddressValidator implements Validator {

	public boolean supports(Class clazz) {
		return Address.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "street", "street.empty");
		ValidationUtils.rejectIfEmpty(e, "avenue", "avenue.empty");
	}
}