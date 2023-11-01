package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Librarian;

public class LibrarianDa {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("deva");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Librarian saveLibrarian(Librarian librarian) {
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}
	public Librarian deleteLibrarian(int id) {
		Librarian librarian=entityManager.find(Librarian.class, id);
		entityTransaction.begin();
		entityManager.remove(librarian);
		entityTransaction.commit();
		return librarian;
	}
	public Librarian updateLibrarian(int id,String password) {
		Librarian librarian=entityManager.find(Librarian.class, id);
		librarian.setPassword(password);
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		
		return librarian;
	}
	public Librarian getLibrarianById(int id) {
        Librarian librarian= entityManager.find(Librarian.class, id);
		return librarian;

	}
	public List<Librarian> getAllres() {
		String sql = "SELECT l FROM Librarian l";  		
		Query query = entityManager.createQuery(sql); 		
		List<Librarian> librarian = query.getResultList();
		return librarian;
	}
	
	public boolean approveLibrarian(Librarian librarian) {
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;
	}

}
