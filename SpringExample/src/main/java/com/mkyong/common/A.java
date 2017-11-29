package com.mkyong.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {

	@Autowired
	//@Qualifier("D1")
	private B D ;
	
	@Autowired
	private B D1 ;
	
	public void setD(B d) {
		this.D = d;
	}
	
	public void setD1(B d1) {
		this.D1 = d1;
	}

	public void display(){
		System.out.println("I'm from A");
		System.out.println("B >> "+ D1.getClass());
		//System.out.println("name >> "+ D1.getName());
		
		System.out.println("----------------------");
		
		System.out.println("I'm from A");
		System.out.println("B >> "+ D.getClass());
		//System.out.println("name >> "+ D.getName());
	}
	
}
