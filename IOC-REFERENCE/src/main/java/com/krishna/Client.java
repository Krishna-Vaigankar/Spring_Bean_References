package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring.xml");

		Car c = (Car) ac.getBean("c");
		
		c.printcardata();
	}

}
