package com.bean;

public class User {
private String id;
private String name;
private String age;

public User(String id, String name, String age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
}

}
