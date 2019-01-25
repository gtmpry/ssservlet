package com.gautam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet(name = "Calculator", urlPatterns = {"/gtm"})
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		out1=response.getWriter();
		String a = request.getParameter("number1");
		String b = request.getParameter("number2");
		//int c=Integer.parseInt(a);
		//int d=Integer.parseInt(b);
		int a5=Integer.parseInt(a)+Integer.parseInt(b);
		
		out1.print(a5);
	}

}
