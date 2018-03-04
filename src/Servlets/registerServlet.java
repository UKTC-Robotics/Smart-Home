package Servlets;

import java.io.IOException;
import Beans.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
    public registerServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		
		
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String userName = request.getParameter("uName");
		String eMail = request.getParameter("eMail");
		String country = request.getParameter("country");
		String pass = request.getParameter("pass");	
		user user = new user(firstName,lastName,userName,eMail,country,pass);
		user.insertIntoDB();   
	}

}
