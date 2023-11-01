package com.jsp.service;

import java.util.List;

import com.jsp.dao.AdminDa;
import com.jsp.dao.LibrarianDa;
import com.jsp.dto.Admin;
import com.jsp.dto.Librarian;

public class AdminSer {
	AdminDa adminDao = new AdminDa();
	LibrarianDa librarianDao=new LibrarianDa();
	
	public Admin saveAdmin(Admin admin) {
		if(admin.getAdmin_name() != null && admin.getAdmin_email() != null 
				&& admin.getAdmin_pass() != null) {
			return adminDao.saveAdmin(admin);
		}
		return null;
	}
	
	public boolean deleteAdmin(int id) {
		return adminDao.deleteAdmin(id);
	}
	
	public boolean updateadminpass(int id, String pass) {
		return adminDao.updateadminpass(id, pass);
	}
	
	public boolean loginAdmin(String user,String pass) {
		List<Admin> admins = adminDao.getAllres();
		for (Admin admin: admins) {
			if (admin.getAdmin_email().equals(user) && admin.getAdmin_pass().equals(pass)) {
				return true;
				}
		}
		return false;
	}
	public boolean approveLibrarian(int lib_id,int admin_id) {
		Librarian librarian=librarianDao.getLibrarianById(lib_id);
		Admin admin=adminDao.getAdmin(admin_id);
		if (librarian!=null && admin!=null) {
			librarian.setStatus("authorized");
			librarian.setAdmin(admin);
			return librarianDao.approveLibrarian(librarian);
		}
		return false;
	}
}


