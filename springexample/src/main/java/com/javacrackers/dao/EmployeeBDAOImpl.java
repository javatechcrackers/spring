package com.javacrackers.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.javacrackers.model.EmployeeB;

@Service
public class EmployeeBDAOImpl implements EmployeeBDAO {

	@PersistenceContext(unitName="PersistenceUnitB")
	private EntityManager entityManager;

	public void persistEmployee(EmployeeB employee) throws Exception {
		entityManager.persist(employee);
//		throw new Exception();
	}
}