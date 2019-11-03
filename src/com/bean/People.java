package com.bean;

public class People {
	 public String color;
	 public String sex;
	 
	 public void eat(){
		 System.out.println("³ÔµÄ·½·¨");
	 }
	 public People(){
		 
	 }
	public People(String color, String sex) {
		super();
		this.color = color;
		this.sex = sex;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	 
	
	
}
