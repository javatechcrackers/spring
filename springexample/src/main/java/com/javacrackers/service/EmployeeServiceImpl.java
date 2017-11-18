package com.javacrackers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacrackers.dao.EmployeeADAO;
import com.javacrackers.dao.EmployeeBDAO;
import com.javacrackers.model.EmployeeA;
import com.javacrackers.model.EmployeeB;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeADAO employeeADAO;
	
	@Autowired
	EmployeeBDAO employeeBDAO;
	
	@Transactional(rollbackFor=Exception.class)
	public void persistEmployees(EmployeeA employeeA, EmployeeB employeeB) throws Exception {
		System.out.println("Persist A");
		employeeADAO.persistEmployee(employeeA);
		System.out.println("Persist A OK - persist B");
		employeeBDAO.persistEmployee(employeeB);
		System.out.println("Persist B okk");
	}

}
