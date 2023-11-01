package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.dto.Employe;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("deva");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public Employe saveEmployee(Employe employe) {
		entityTransaction.begin();
		entityManager.persist(employe);
		entityTransaction.commit();
		return employe;
	}
	public boolean deleteEmployee(int id) {
		Employe employe=entityManager.find(Employe.class, id);
		entityTransaction.begin();
		entityManager.remove(employe);
		entityTransaction.commit();
		return true;
	}
	
	public Employe updatEmploye(Employe employe) {
		entityTransaction.begin();
		entityManager.merge(employe);
		entityTransaction.commit();
		return employe;
	}
	
	public Employe getById(int id) {
		Employe employe=entityManager.find(Employe.class, id);
		System.out.println(employe.getId());
		System.out.println(employe.getName());
		System.out.println(employe.getEmail());
		System.out.println(employe.getGender());
		System.out.println(employe.getSalary());
		return employe;

	}
	public List<Employe> getAll(){
		String sql="select e from Employe e";
		Query query=entityManager.createQuery(sql);
		 return query.getResultList();
	}

}
