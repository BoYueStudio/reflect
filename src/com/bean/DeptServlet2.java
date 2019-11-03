package com.bean;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;




public class DeptServlet2 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet2的初始化方法");
	}
	
	public DeptServlet2() {
		super();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String method=req.getParameter("method");

		
	
	}


}
