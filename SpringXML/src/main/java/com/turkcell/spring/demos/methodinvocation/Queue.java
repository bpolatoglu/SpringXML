package com.turkcell.spring.demos.methodinvocation;

public class Queue {
	
	private int count;
	private String name;
	
	public void increase() {
		System.out.println(name + " queue count  is " + ++count);
	}
	
	@SuppressWarnings("unused")
	private void init() {
		System.out.println( name + " queue is starting.. ");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
