package com.sampleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletDemo extends HttpServlet {

	private String mymsg;

//	   public void init() throws ServletException {
//	      mymsg = "Hello World!";
//	   }

	   public void doGet(HttpServletRequest request, 
	      HttpServletResponse response)
	      throws ServletException, IOException 
	   {

	      response.setContentType("text/html");

          PrintWriter out = response.getWriter();
          out.println("<h1> Hello World </h1>");
	   }

	   public void destroy() {
	    
	   }
}
