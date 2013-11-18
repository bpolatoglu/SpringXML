package com.turkcell.spring.demos.services;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import com.turkcell.spring.demos.bean.Employee;
import com.turkcell.spring.demos.dao.EmployeeDAO;
import com.turkcell.spring.demos.validation.EmployeeValidator;

public class EmployeeService {

	private EmployeeDAO employeeDAO;
	
	private EmployeeValidator employeeValidator;
	
	public void selectAllEmployees() {
		List<Employee> list = employeeDAO.selectAll();
		System.out.println("Employee List Size:" + list.size());
	}
	
	public void save(Employee employee){
		DataBinder binder = new DataBinder(employee);
		binder.addValidators(employeeValidator);
		binder.validate();
		BindingResult bindingResult = binder.getBindingResult();
		List<ObjectError> allErrors = bindingResult.getAllErrors();
		for (ObjectError objectError : allErrors) {
			System.out.println("Error :" + objectError.getCode());
		}
	}
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	public void setEmployeeValidator(EmployeeValidator employeeValidator) {
		this.employeeValidator = employeeValidator;
	}
}
