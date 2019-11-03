package com.test;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bean.User;

public class UserXml {
	public static void main(String[] args) throws DocumentException{
		
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read(UserXml.class.getResourceAsStream("user.xml"));
		Element root=document.getRootElement();
		List<Element> elements=root.elements();
		List<User> userList=new ArrayList<User>();
		for(Element e: elements){
			String id=e.attributeValue("id");
			String name=e.attributeValue("name");
			String age=e.attributeValue("age");
			User user=new User(id, name, age);
			userList.add(user);
		}
		System.out.println(userList);
	}

}
