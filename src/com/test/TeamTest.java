package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bean.Team1;

public class TeamTest {
public static void main(String[] args) throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
	
	HashMap<String,Object> ico=new Spring().getIco();
	
	
	System.out.println(ico.get("team1"));
	
}
}
