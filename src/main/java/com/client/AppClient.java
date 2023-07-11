package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BankingService;

public class AppClient {
	public static void main(String[] args) {
		
		//creating a container
		//to create a object spring uses factory DP, all the objects are singleton
		//spring container eagerly creates all the objects ,eager loading
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		BankingService service1= (BankingService)context.getBean("service");
		BankingService service2= (BankingService)context.getBean("service");
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
		//invoke a service
		
		//BankingService service= (BankingService)context.getBean("service");
		
		//System.out.println(service.service(8856));
	}

}
