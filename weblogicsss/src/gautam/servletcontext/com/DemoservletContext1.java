package gautam.servletcontext.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoservletContext1
 */
public class DemoservletContext1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		Enumeration<String> e=context.getInitParameterNames();
		
		String str="";
		while(e.hasMoreElements())
		{
			str=e.nextElement();
			out.print("Name :"+str+"<br>");
			out.print("Value :"+context.getInitParameter(str)+"<br>");
		}
	}

}
