package in.mindcraft;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	
	public void service(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		//get parameter will contain name that is in index.html
		String a = request.getParameter("username");
		response.getWriter().println("Welcome to app " +a);
		
	}

}
