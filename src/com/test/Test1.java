package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.bean.People;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		//�ȴ�������
//		People p=new People();
//		p.setColor("��");
//		System.out.println("color:"+p.getColor());
		
		//������ƣ��ڳ������е�ʱ��ͨ��Ԫ���ݴ�������ʵ��
		
		Class source=Class.forName("com.bean.People");
		
		Object object=source.newInstance();//��ȡpeopleԴ����,
		
		
//		People p2=(People) object;
//		p2.eat();
		
		Method method=source.getMethod("eat");
		
		method.invoke(object);
		
		Constructor people_constructor=source.getConstructor(String.class,String.class);
		Object color="��ɫ";
		Object sex="��";
	    Object object2=people_constructor.newInstance(color,sex);
	    
	    Method method2=source.getMethod("setColor",String.class);
	    method2.invoke(object2,"��ɫ");
	    
	    Method method3=source.getMethod("getColor");
	    Object obje= method3.invoke(object2);
	    System.out.println(obje);
	    
	   Object object3= source.newInstance();
	   Method method4=source.getMethod("setSex", String.class);
	   method4.invoke(object3, "Ů��");
	   Method method5=source.getMethod("getSex");
	   System.out.println(method5.invoke(object3));
	    
		
		
		
		
		
		
		
		
		
	}
}
