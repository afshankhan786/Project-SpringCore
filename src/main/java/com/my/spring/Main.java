package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee bean = ioc.getBean("emp1",Employee.class);
		System.out.println(bean);
		
		Employee bean2 = ioc.getBean("emp2",Employee.class);
		System.out.println(bean2);

//		bean.setName("Guest");	
//		System.out.println(bean);
 
	}

}
