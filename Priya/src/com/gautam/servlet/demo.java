package com.gautam.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/demo")
public class demo extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1244161269465787421L;
	java.io.PrintWriter out1;
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		try{
			res.setContentType("text/html");
			out1=res.getWriter();
			out1.print("Priya");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}