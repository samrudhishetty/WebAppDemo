package in.mindcraft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException
	{
		int a = Integer.parseInt(request.getParameter("num1"));
		// to get the number present in the html page write name
		int b = Integer.parseInt(request.getParameter("num2"));
		int c = a + b;
		
//		request.setAttribute("c", c);
//		System.out.println(c); //to print this in console
//		response.getWriter().println("Addition = "+c);
		
//		RequestDispatcher rd  = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
		
//		response.sendRedirect("sq?c=" +c); //url writting 
		
//		HttpSession session = request.getSession(); // using HttpSession Object
//		session.setAttribute("c", c);
//		response.sendRedirect("sq");
		
		Cookie cookie = new Cookie("c",c+"");
		response.addCookie(cookie);
		response.sendRedirect("sq");
	}

}
