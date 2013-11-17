package com.turkcell.spring.demos.bean;

public class Employee {

	private String name;
	private String surname;
	private Integer fileNo;
	private Integer age;
	
	public Employee(Integer fileNo) {
		this.setFileNo(fileNo);
	}
	
	public Employee() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getFileNo() {
		return fileNo;
	}

	public void setFileNo(Integer fileNo) {
		this.fileNo = fileNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
