package com.gl.employee;

import java.util.ArrayList;
/**
 * 
 * @author swati.khobragade
 *
 */
public class Employee {
	private String empName;
	private int empAge;
	private String empDesignation;
	private String empType;
	private ArrayList<EducationDetails> empEduDetails;
	private ArrayList<EmploymentDetails> empEmploymentDetails;

	public Employee() {
		super();
	}

	public Employee(String empName, int empAge, String empDesignation, String empType,
			ArrayList<EducationDetails> empEduDetails, ArrayList<EmploymentDetails> empEmploymentDetails) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empDesignation = empDesignation;
		this.empType = empType;
		this.empEduDetails = empEduDetails;
		this.empEmploymentDetails = empEmploymentDetails;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public ArrayList<EducationDetails> getEmpEduDetails() {
		return empEduDetails;
	}

	public void setEmpEduDetails(ArrayList<EducationDetails> empEduDetails) {
		this.empEduDetails = empEduDetails;
	}

	public ArrayList<EmploymentDetails> getEmpEmploymentDetails() {
		return empEmploymentDetails;
	}

	public void setEmpEmploymentDetails(ArrayList<EmploymentDetails> empEmploymentDetails) {
		this.empEmploymentDetails = empEmploymentDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empName=");
		builder.append(empName);
		builder.append(", empAge=");
		builder.append(empAge);
		builder.append(", empDesignation=");
		builder.append(empDesignation);
		builder.append(", empType=");
		builder.append(empType);
		builder.append(", empEduDetails=");
		builder.append(empEduDetails);
		builder.append(", empEmploymentDetails=");
		builder.append(empEmploymentDetails);
		builder.append("]");
		return builder.toString();
	}

}
