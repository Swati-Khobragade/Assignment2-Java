package com.gl.employee;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	static ArrayList<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
		addEmployeeData();
		getDevelopersList();
		getNoPastOrgEmployeeList();
		getTwoYrsExpDevelopersList();
	}

	private static void getDevelopersList() {
		if (!empList.isEmpty()) {
			for (Employee employee : empList) {
				if (employee.getEmpType().equalsIgnoreCase("Developer")) {
					System.out.println("Employee who is developer::" + employee);
				}
			}
		}
	}

	private static void getNoPastOrgEmployeeList() {
		if (!empList.isEmpty()) {
			for (Employee employee : empList) {
				if (employee.getEmpEmploymentDetails() == null) {
					System.out.println("Employee who have not worked in any other organisation::" + employee);
				}
			}
		}
	}

	private static void getTwoYrsExpDevelopersList() {
		if (!empList.isEmpty()) {
			for (Employee employee : empList) {
				if (employee.getEmpType().equalsIgnoreCase("Developer")) {
					double experience = 0;
					for (EmploymentDetails employmentDetails : employee.getEmpEmploymentDetails()) {
						experience += employmentDetails.getDuration();
					}
					if (experience > 2) {
						System.out.println("Developers with experience more than 2 Years::" + employee);
					}
				}
			}
		}
	}

	private static void addEmployeeData() {
		ArrayList<EducationDetails> empEduDetailsList = new ArrayList<EducationDetails>();
		ArrayList<EmploymentDetails> empEmplDetailsList = new ArrayList<EmploymentDetails>();
		ArrayList<EmploymentDetails> empEmplDetailsList1 = new ArrayList<EmploymentDetails>();
		EducationDetails educationDetails = new EducationDetails();
		educationDetails.setDegree("BTech");
		educationDetails.setUniversity("RTMNU");
		educationDetails.setGrade("I");
		educationDetails.setPercent(80.0);
		educationDetails.setDate(new Date());
		empEduDetailsList.add(educationDetails);
		EducationDetails educationDetails1 = new EducationDetails();
		educationDetails1.setDegree("HSC");
		educationDetails1.setUniversity("RTMNU");
		educationDetails1.setGrade("I");
		educationDetails1.setPercent(70.0);
		educationDetails1.setDate(new Date());
		empEduDetailsList.add(educationDetails);

		EmploymentDetails employmentDetail = new EmploymentDetails();
		employmentDetail.setOrganizationName("TCS");
		employmentDetail.setTechnology("Java");
		employmentDetail.setProject("ERP");
		employmentDetail.setDuration(2.0);
		empEmplDetailsList.add(employmentDetail);

		EmploymentDetails employmentDetail1 = new EmploymentDetails();
		employmentDetail1.setOrganizationName("Infosys");
		employmentDetail1.setTechnology("Java");
		employmentDetail1.setProject("Insurance");
		employmentDetail1.setDuration(2.0);
		empEmplDetailsList1.add(employmentDetail);
		empEmplDetailsList1.add(employmentDetail1);

		Employee employee = new Employee("Kunal", 25, "Software Engineer", "developer", empEduDetailsList,
				empEmplDetailsList);
		Employee employee1 = new Employee("Radhika", 24, "Software Developer", "developer", empEduDetailsList,
				empEmplDetailsList);
		Employee employee2 = new Employee("Vedant", 22, "Software Tester", "developer", empEduDetailsList,
				empEmplDetailsList1);
		Employee employee3 = new Employee("Vaibhav", 24, "Software Developer", "manager", empEduDetailsList,
				empEmplDetailsList);
		Employee employee4 = new Employee("Amit", 25, "Software Developer", "admin", empEduDetailsList, null);
		Employee employee5 = new Employee("Amol", 24, "Software Developer", "developer", empEduDetailsList,
				empEmplDetailsList);
		Employee employee7 = new Employee("Sanjana", 24, "Software Developer", "developer", empEduDetailsList,
				empEmplDetailsList);
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		empList.add(employee5);
		System.out.println("empList::" + empList);

	}

}
