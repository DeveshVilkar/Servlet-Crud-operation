package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Employe;
import com.jsp.service.EmployeeService;
@WebServlet("/save")
public class SaveController extends HttpServlet{
	
	EmployeeService employeeService=new EmployeeService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String salary=req.getParameter("salary");
		
//		*******
		double sal=Double.parseDouble(salary);
//		do not globalize employe because it replaces data
		Employe employe=new Employe();
		employe.setName(name);
		employe.setEmail(email);
		employe.setGender(gender);
		employe.setSalary(sal);
		Employe e=employeeService.saveEmployee(employe);
		
		if (e!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("save.jsp");
			requestDispatcher.include(req, resp);
		}
		
		
	
		
		
		
	}
	

}
