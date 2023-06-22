package com.jsp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jsp.dto.Destination;
import com.jsp.util.ConnectionClass;


public class DestinationRepImp  implements DestinationRep{
	
	private EntityManager manager = ConnectionClass.getEntityManagerFactory().createEntityManager();
	
	@Override
	public String save(Destination destination) {
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(destination);
			transaction.commit();
			return "Saved Successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Something Went Wrong";
	}

	@Override
	public String update(Destination destination) {
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(destination);
			transaction.commit();
			return "updated Successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Something Went Wrong";
		
	}

	@Override
	public String delete(int id) {
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Destination destination = manager.find(Destination.class, id);
			if(destination.getId()!=0) {
			manager.remove(destination);
			transaction.commit();
			return "Data Deleted";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Something Went Wrong";
	}

	@Override
	public Destination getById(int id) {
		Destination destination = manager.find(Destination.class,id);
		return destination;
	}

	@Override
	public List<Destination> getByName(String name) {
		 Query query = manager.createQuery("FROM Destination d WHERE d.name=?1");
		 query.setParameter(1,name);
		List<Destination> list = query.getResultList();
		return list;
	}

	@Override
	public List<Destination> getAll() {
		Query query = manager.createQuery("FROM Destination d");
		List<Destination> list = query.getResultList();
		System.out.println(list);
		return list;
	}
	
}
