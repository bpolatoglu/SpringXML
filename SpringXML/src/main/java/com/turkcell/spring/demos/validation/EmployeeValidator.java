package com.turkcell.spring.demos.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.turkcell.spring.demos.bean.Employee;

public class EmployeeValidator implements Validator {
	
	/**
	 * This Validator validates *just* Employee instances
	 */
	public boolean supports(Class clazz) {
		return Employee.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		Employee p = (Employee) obj;
		if (p.getAge() == null){
			e.rejectValue("age", "nullvalue");
		} else if (p.getAge() < 0) {
			e.rejectValue("age", "negativevalue");
		} else if (p.getAge() > 110) {
			e.rejectValue("age", "too.darn.old");
		}
	}
}