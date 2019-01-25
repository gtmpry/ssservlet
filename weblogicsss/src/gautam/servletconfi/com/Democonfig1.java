package gautam.servletconfi.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

/**
 * Servlet implementation class Democonfig1
 */
public class Democonfig1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		ServletConfig config=getServletConfig();
		Enumeration<String> e=config.getInitParameterNames();
		String str="";
		while(e.hasMoreElements())
		{
			str=e.nextElement();
			out.println("<br> Name :"+str);
			out.println("<br> Value :"+config.getInitParameter(str));
		}
		out.close();
	}
}
