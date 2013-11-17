package com.turkcell.spring.demos.services;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.turkcell.spring.demos.event.BlackListEvent;

public class EmailService implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;
	private List<String> blackList;

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
	
	public void sendEmail(String address, String text){
		if (blackList.contains(address)) {
			System.out.println("blacklist email found, publishing event..");
			BlackListEvent event = new BlackListEvent(this, address, text);
			applicationEventPublisher.publishEvent(event);
			return;
			
		}
		
		System.out.println("Sent mail successfully!");
		// send email normally..
	}
	
}
