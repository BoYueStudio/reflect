package com.test;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Spring {
	
	public static HashMap<String, Object> getIco() {
		return ico;
	}
	public static void setIco(HashMap<String, Object> ico) {
		Spring.ico = ico;
	}
	private static HashMap<String,Object> ico=new HashMap<>();
static{
	try{
	ico=new HashMap<>();
	SAXReader saxReader=new SAXReader();
	Document document=saxReader.read(TeamTest.class.getResourceAsStream("team.xml"));
	Element root=document.getRootElement();
	List<Element> elements=root.elements();
	
	for(Element e: elements){
		String id=e.attributeValue("id");
		String className=e.attributeValue("class");
		Class clazz=Class.forName(className);
		Object obj=clazz.newInstance();
		Method setid=clazz.getMethod("setId", String.class);
		setid.invoke(obj, id);
		
		List<Element> propertys=e.elements();
		for(Element p: propertys){
			String name=p.attributeValue("name");
			String value=p.attributeValue("value");
			
			String nameT="set"+name.substring(0,1).toUpperCase()+name.substring(1,name.length());
			
			Method setter=clazz.getMethod(nameT, String.class);
			setter.invoke(obj, value);
			
			
		}
		ico.put(id, obj);
		
	}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
}
}
