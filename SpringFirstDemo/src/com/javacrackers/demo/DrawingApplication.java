package com.javacrackers.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Shhape shape= new Circle();
DrawingApplication ap= plication= new DrawingApplication();*/
		//BeanFactory factory= new XMLBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();


	}

	
}
