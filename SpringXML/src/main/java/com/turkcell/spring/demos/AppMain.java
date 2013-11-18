package com.turkcell.spring.demos;

import org.springframework.beans.factory.config.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.turkcell.spring.demos.bean.Employee;
import com.turkcell.spring.demos.conf.MyThreadScope;
import com.turkcell.spring.demos.methodinvocation.QueueManager;
import com.turkcell.spring.demos.propertyeditor.AccountNameTypeBuilder;
import com.turkcell.spring.demos.services.AccountService;
import com.turkcell.spring.demos.services.BankService;
import com.turkcell.spring.demos.services.CustomerService;
import com.turkcell.spring.demos.services.EmailService;
import com.turkcell.spring.demos.services.EmployeeService;
import com.turkcell.spring.demos.services.EndOfDayService;

public class AppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String [] {"classpath:app-context.xml"});
		// method invocation

		QueueManager queueManager = context.getBean(QueueManager.class);
		queueManager.addToQueue();
		queueManager.addToQueue();
		queueManager.addToQueue();
			
		
		/*
		CustomerService customerService = (CustomerService) context.getBean(CustomerService.class);
		System.out.println("1" + customerService);
		
		BankService bankBean = (BankService) context.getBean(BankService.class);
		System.out.println("2" + bankBean);
		
		EndOfDayService endOfDayService = context.getBean(EndOfDayService.class);
		System.out.println("3" + endOfDayService);
		

	
		

		AccountService accountService = (AccountService) context.getBean("accountService");
		System.out.println(accountService);
	
		
		
		AccountService accountService = context.getBean(AccountService.class);
		System.out.println(accountService);
		
		EndOfDayService endOfDayService = context.getBean(EndOfDayService.class);
		System.out.println(endOfDayService);
		
			
		// custom scope
		Scope threadScope = new MyThreadScope();
		context.getBeanFactory().registerScope("myThread", threadScope);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.selectAllEmployees();
		
		
		// custom event
		EmailService emailService = context.getBean(EmailService.class);
		emailService.sendEmail("ulker.ozgen@gmail.com", "deneme 1-2");
		emailService.sendEmail("ulkeroz@gmail.com", "deneme 1-2");
		
		// validation example
		employeeService.save(new Employee());
		
		// custom property ediyor
		AccountNameTypeBuilder accountNameTypeBuilder = context.getBean(AccountNameTypeBuilder.class);
		accountNameTypeBuilder.getAccountNameType();
		
		*/
		// finally close context..
		context.close();
		
	}
	
}
