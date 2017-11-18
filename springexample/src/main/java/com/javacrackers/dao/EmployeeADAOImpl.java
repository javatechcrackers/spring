package com.javacrackers.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.javacrackers.model.EmployeeA;

@Service
public class EmployeeADAOImpl implements EmployeeADAO {

	@PersistenceContext(unitName="PersistenceUnitA")
	private EntityManager entityManager;

	public void persistEmployee(EmployeeA employee) {
		entityManager.persist(employee);
	}


}