package com.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fitness.models.Employee_det;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee_det, Integer> {

	@Query("select e from Employee_det e where e.userName =:uname")
	public Employee_det findByUnameAndPwd(@Param("uname") String uname);
}
