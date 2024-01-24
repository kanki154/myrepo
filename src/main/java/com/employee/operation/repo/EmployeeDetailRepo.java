package com.employee.operation.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.operation.entity.EmployeeDetails;

public interface EmployeeDetailRepo extends JpaRepository<EmployeeDetails,Long>{

}
