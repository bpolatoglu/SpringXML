package com.turkcell.spring.demos.event;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent{

	private static final long serialVersionUID = 5139922674048205614L;
	
	private String address;
	private String text;
	
	public BlackListEvent(Object source, String address, String text) {
		super(source);
		this.text = text;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
