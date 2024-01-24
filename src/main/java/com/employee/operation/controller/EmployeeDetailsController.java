package com.employee.operation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.employee.operation.entity.EmployeeDetails;
import com.employee.operation.repo.EmployeeDetailRepo;

@RestController
public class EmployeeDetailsController {
	
	
	@org.springframework.beans.factory.annotation.Autowired
	EmployeeDetailRepo employeetrepo;
	
	@org.springframework.web.bind.annotation.PostMapping("/api/employee")
	public org.springframework.http.ResponseEntity<EmployeeDetails> saveEmployeeDetails(EmployeeDetails employeeDetails) {
		
	return  new org.springframework.http.ResponseEntity<>( employeetrepo.save(employeeDetails),HttpStatus.CREATED);
		
	}
	
	@org.springframework.web.bind.annotation.GetMapping("/api/employee")
	public org.springframework.http.ResponseEntity<List<EmployeeDetails>> getEmployeeDetails() {
		
	return  new org.springframework.http.ResponseEntity<>( employeetrepo.findAll(),HttpStatus.OK);
		
	}

}
