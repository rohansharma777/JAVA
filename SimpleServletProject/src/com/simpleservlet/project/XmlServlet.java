package com.simpleservlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello !" + userName);
	}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			PrintWriter out = response.getWriter();
			String userName = request.getParameter("userName");
			String userPassword = request.getParameter("userPassword");
			out.println("Hello !" + userName +" Your password is "+ userPassword);
		}
		
}