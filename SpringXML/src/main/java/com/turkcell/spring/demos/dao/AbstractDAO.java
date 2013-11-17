package com.turkcell.spring.demos.dao;

public abstract class AbstractDAO {
	
	private String tableName;

	public void insert(Object obj) {
		System.out.println("inserted");
	}
	public void update(Object obj) {
		System.out.println("updated");
	}
	public void delete(Object obj) {
		System.out.println("deleted");
	}
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		return tableName;
	}
}
