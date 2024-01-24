package com.employee.operation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/api/employee/{id}")
	public ResponseEntity<EmployeeDetails> getStudentDetailsById(@PathVariable long id) {
		
		Optional<EmployeeDetails> student= employeetrepo.findById(id);
		if(student.isPresent())
		{
			return  new ResponseEntity<>(student.get(),HttpStatus.OK);
		} 
		else {
			return  new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}
	
		
	}

}
