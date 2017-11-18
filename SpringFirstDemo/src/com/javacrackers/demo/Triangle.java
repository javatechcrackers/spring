package com.javacrackers.demo;

public class Triangle extends Shape{

	private String type;
	private int length;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public int getLength() {
		return length;
	}
	public String getType() {
		return type;
	}
	/*public Triangle(String type,int length){
		this.type=type;
		this.length= length;
	}*/
	public void draw(){
		
		/*System.out.println("Triangle Draw type"+getType()+"LENGTH"+getLength());*/
		System.out.println("Point A"+getPointA().getX());
		System.out.println("Point B"+getPointB().getX());
		System.out.println("Point C"+getPointC().getX());
	}
}
