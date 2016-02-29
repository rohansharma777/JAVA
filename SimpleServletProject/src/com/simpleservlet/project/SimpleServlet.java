package com.simpleservlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello World from Get method");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h3>Kem chho</h3>");
		pw.println("<ol><li>Uno</li><li>Dos</li><li>Tres</li></ol>");
		pw.println("Kem chho ?");
		pw.println("<p><b>Kem chho ?</b></p>");
		pw.println("To view maps <a href = \"http://maps.google.com\">click here</a>");
	}

}
