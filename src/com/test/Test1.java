package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.bean.People;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		//先创建对象
//		People p=new People();
//		p.setColor("黄");
//		System.out.println("color:"+p.getColor());
		
		//反射机制，在程序运行的时候通过元数据创建对象实列
		
		Class source=Class.forName("com.bean.People");
		
		Object object=source.newInstance();//获取people源对象,
		
		
//		People p2=(People) object;
//		p2.eat();
		
		Method method=source.getMethod("eat");
		
		method.invoke(object);
		
		Constructor people_constructor=source.getConstructor(String.class,String.class);
		Object color="黑色";
		Object sex="男";
	    Object object2=people_constructor.newInstance(color,sex);
	    
	    Method method2=source.getMethod("setColor",String.class);
	    method2.invoke(object2,"白色");
	    
	    Method method3=source.getMethod("getColor");
	    Object obje= method3.invoke(object2);
	    System.out.println(obje);
	    
	   Object object3= source.newInstance();
	   Method method4=source.getMethod("setSex", String.class);
	   method4.invoke(object3, "女人");
	   Method method5=source.getMethod("getSex");
	   System.out.println(method5.invoke(object3));
	    
		
		
		
		
		
		
		
		
		
	}
}
