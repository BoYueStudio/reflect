package com.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bean.User;



public class ServletTest1 {
public static void main(String[] args) throws Exception {
	
	
	
	SAXReader saxreader=new SAXReader();
	Document document=saxreader.read(ServletTest1.class.getResourceAsStream("web.xml"));
	Element root=document.getRootElement();
	List<Element> elements=root.elements("servlet");

	for(Element e: elements){
		Element element=e.element("servlet-class");
		String classname=element.getText();
		
		Class clazz=Class.forName(classname);
		Object obj=clazz.newInstance();
		Method method=clazz.getMethod("init");
		method.invoke(obj);
	}
	
}
}
