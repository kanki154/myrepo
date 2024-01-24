package com.employee.operation.entity;

import jakarta.persistence.Entity;


@Entity
public class EmployeeDetails {
	
	
	@jakarta.persistence.Id
	private long employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeeAddress;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public EmployeeDetails(long employeeId, java.lang.String employeeName, java.lang.String employeeEmail,
			java.lang.String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeAddress = employeeAddress;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeAddress=" + employeeAddress + "]";
	}
	
	
}
