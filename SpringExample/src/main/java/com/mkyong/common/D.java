package com.mkyong.common;

public class D  extends C implements B{

	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void display(){
		System.out.println("I'm from D - > B");
	}
	
	public void display(String name){
		System.out.println("I'm from D - > B "  + name);
	}
}
