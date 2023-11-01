package com.jsp.task;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String save=req.getParameter("insert");
		String del=req.getParameter("delete");
		String update=req.getParameter("update");
		String getone=req.getParameter("getbyid");
		String getall=req.getParameter("getall");
		String librariantable=req.getParameter("getlibrarian");
		String librarian_authorize=req.getParameter("authorize");
		String librarianregister=req.getParameter("librarianregister");
		String adminregister=req.getParameter("adminregister");
		if (save!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("save.jsp");
			requestDispatcher.forward(req, resp);
		}else if (del!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("delete.jsp");
			requestDispatcher.forward(req, resp);
		}else if (update!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("update.jsp");
			requestDispatcher.forward(req, resp);
		}else if (getone!=null) {
			System.out.println("getbyid");
		}else if (getall!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("getall.jsp");
			requestDispatcher.forward(req, resp);
		}else if (librariantable!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("librariantable.jsp");
			requestDispatcher.forward(req, resp);
		}else if (librarian_authorize!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminauthorizelib.jsp");
			requestDispatcher.forward(req, resp);
		}else if (librarianregister!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("librarianregister.jsp");
			requestDispatcher.forward(req, resp);
		}else if (adminregister!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminregister.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
