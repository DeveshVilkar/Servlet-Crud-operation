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
@WebServlet("/update")
public class UpdateController extends HttpServlet {
	EmployeeService employeeService=new EmployeeService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String old_email=req.getParameter("oldemail");
		String email=req.getParameter("email");
		
		Integer eid=Integer.parseInt(id);

		Employe employe=employeeService.updatEmploye(eid, email,old_email);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);
		
	}

}
