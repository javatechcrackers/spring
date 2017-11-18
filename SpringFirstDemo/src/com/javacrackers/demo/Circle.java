package com.javacrackers.demo;

public class Circle extends Shape{
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
public void draw(){
		
		System.out.println("Circle Draw type"+getType());
	}
}
