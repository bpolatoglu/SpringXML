package com.turkcell.spring.demos.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<ApplicationEvent>{

	private String notificationAddress;
	
	
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof BlackListEvent) {
			System.out.println("Event occured! ");
		}
	}
	
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}
	public String getNotificationAddress() {
		return notificationAddress;
	}

}
