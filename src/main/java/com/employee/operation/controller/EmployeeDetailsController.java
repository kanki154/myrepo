package com.employee.operation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.employee.operation.entity.EmployeeDetails;
import com.employee.operation.repo.EmployeeDetailRepo;

@RestController
public class EmployeeDetailsController {
	
	
	@org.springframework.beans.factory.annotation.Autowired
	EmployeeDetailRepo studentrepo;
	
	@org.springframework.web.bind.annotation.PostMapping("/api/student")
	public org.springframework.http.ResponseEntity<EmployeeDetails> saveStudentDetails(EmployeeDetails studentDetails) {
		
	return  new org.springframework.http.ResponseEntity<>( studentrepo.save(studentDetails),HttpStatus.CREATED);
		
	}

}
