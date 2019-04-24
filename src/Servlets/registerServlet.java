
package Servlets;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import Beans.*;
import Validation.userValidation;

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
		if(firstName.isEmpty()||lastName.isEmpty()||userName.isEmpty()||eMail.isEmpty()||country.isEmpty()||pass.isEmpty()) {
		
			    response.setContentType("text/html; charset = UTF-8");
	            PrintWriter pw = response.getWriter();
	            pw.println("Âñè÷êè ïîëåòà ñà çàäúëæèòåëíè!");
		}
		if(!userValidation.validate(eMail)) {
			System.out.println(userValidation.validate(eMail));
		}
		else
			System.out.println("Super!");
		
		user user = new user(firstName,lastName,userName,eMail,country,pass);
		user.insertIntoDB();   
	}
}
=======
package Servlets;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import Beans.*;
import Validation.userValidation;

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
		if(firstName.isEmpty()||lastName.isEmpty()||userName.isEmpty()||eMail.isEmpty()||country.isEmpty()||pass.isEmpty()) {
		
			    response.setContentType("text/html; charset = UTF-8");
	            PrintWriter pw = response.getWriter();
	            pw.println("Âñè÷êè ïîëåòà ñà çàäúëæèòåëíè!");
		}
		if(!userValidation.validate(eMail)) {
			System.out.println(userValidation.validate(eMail));
		}
		else
			System.out.println("Super!");
		
		user user = new user(firstName,lastName,userName,eMail,country,pass);
		user.insertIntoDB();   
	}
}

