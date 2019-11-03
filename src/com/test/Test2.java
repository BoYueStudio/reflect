package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
	
	Class source=Class.forName("com.bean.Mathor");
	
	Object obj1=source.newInstance();
	Method method1=source.getMethod("sum", int.class,int.class);
	Object value1=method1.invoke(obj1, 234,345);
	System.out.println(value1);
	
	Class source2=Class.forName("com.bean.People");
	Object obj2=source2.newInstance();
	Constructor p=source2.getConstructor();
	Method method=source2.getMethod("setSex", String.class);
	method.invoke(obj2, "好好先生");
	
	Method method2=source2.getMethod("getSex");
	System.out.println(method2.invoke(obj2));
	
	Field color=source2.getField("color");
	color.set(obj2, "黑色");
	System.out.println(color.get(obj2));
	
}
}
