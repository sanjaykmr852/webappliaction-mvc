package com.spring.webapplication.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.webapplication.validation.ValidationService;

@WebServlet(urlPatterns= {"/login.do","/login.go"})
public class LoginServlet extends HttpServlet{

	@Autowired
private ValidationService service;
	
	@Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	  {
		  String id = request.getParameter("id");
			request.setAttribute("id",id);
		  request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
		  
	  }
	  
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	  {
		  String status=service.doValidation(request.getParameter("name"),  request.getParameter("password"));
		  if("success".equals(status)) {
			  request.setAttribute("name", request.getParameter("name")); 
			  request.setAttribute("password", request.getParameter("password")); 
			  request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
		  }else {
			  request.setAttribute("errorMessage",status);
			  request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
		  }
	  }

}
