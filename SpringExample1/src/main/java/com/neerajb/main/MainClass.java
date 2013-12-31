package com.neerajb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neerajb.shapes.Triangle;


public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("MainClass.main()");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringExample1.xml");
		Triangle obj = context.getBean("triangleBean", Triangle.class);
		System.out.println(obj);
	}
}
