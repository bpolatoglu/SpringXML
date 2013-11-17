package com.turkcell.spring.demos.dao;

import java.util.ArrayList;
import java.util.List;

import com.turkcell.spring.demos.bean.Employee;

public class EmployeeDAO extends AbstractDAO {
	
	private List<Employee> employees = new ArrayList<Employee>();
	private static int count=0;
	
	@SuppressWarnings("unused")
	private void init() {
		employees.add(new Employee(count++));
	}

	public List<Employee> selectAll() {
		return employees;
	}
	
}
