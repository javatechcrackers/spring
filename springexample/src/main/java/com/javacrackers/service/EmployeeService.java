package com.javacrackers.service;

import com.javacrackers.model.EmployeeA;
import com.javacrackers.model.EmployeeB;

public interface EmployeeService {

	void persistEmployees(EmployeeA employeeA, EmployeeB employeeB) throws Exception;
	
}
