package com.fitness.infy.service;

import java.util.List;

import com.fitness.models.Employee_det;

public interface SignUpService {

		public String registerEmployee(Employee_det user);
	
		public List<Employee_det> getEmployees();

		public Employee_det getEmployeeById(Integer id) throws Exception;
		
		public String updateEmployee(Employee_det employee);

		public String deleteEmployeeById(Integer id);
		
		public boolean authenticateUser(String username, String password);
}
