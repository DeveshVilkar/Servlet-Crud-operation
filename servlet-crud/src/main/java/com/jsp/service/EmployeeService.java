package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employe;

public class EmployeeService {
	EmployeeDao employeeDao=new EmployeeDao();
	
	public Employe saveEmployee(Employe employe) {
		if (employe.getName()!=null && employe.getEmail()!=null && employe.getGender()!=null && employe.getSalary()>0) {
			return employeeDao.saveEmployee(employe);
		}
		return null;
	}
	
	public boolean deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
	
	public Employe updatEmploye(int id,String email,String old_email) {
		Employe employe=employeeDao.getById(id);
		if (employe.getEmail()!=old_email) {
			employe.setEmail(email);
			return employeeDao.updatEmploye(employe);
		}
		return null;
	}
	
	public Employe getById(int id) {
		return employeeDao.getById(id);
	}
	
	public List<Employe> getAll(){
		return employeeDao.getAll();
	}

}
