package in.mindcraft;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/addshow")
public class AddLaptopServlet extends HttpServlet {


	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException {


		String idParam = request.getParameter("id");
		int id = Integer.parseInt(idParam);
		
		 String make = request.getParameter("make");
		 String costParam = request.getParameter("cost");
		double cost = Double.parseDouble(costParam);

		String action = request.getParameter("action");
		
		if("Add".equals(action)) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/web_application", "root", "root");
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO laptop VALUES (?, ?, ?)");
			stmt.setInt(1, id);
			stmt.setString(2, make);
			stmt.setDouble(3, cost);
			
			int rowsInserted = stmt.executeUpdate();
			if(rowsInserted>0) {
				response.getWriter().print("Rows Inserted Sucess!!");
			}
			stmt.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {


			e.printStackTrace();
		}
	}
		else if ("Show".equals(action)) 
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/web_application", "root", "root");
				 String query = "SELECT * FROM laptop";
				  PreparedStatement stmt = connection.prepareStatement(query);
				  ResultSet rst = stmt.executeQuery();
				  request.setAttribute("laptopResultSet", rst);
				  request.getRequestDispatcher("result.jsp").forward(request, response);
				  rst.close();
				  stmt.close();
				  connection.close();
			}catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
		}
		
	}

	}
}
