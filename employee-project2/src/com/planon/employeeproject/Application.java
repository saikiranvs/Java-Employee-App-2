package com.planon.employeeproject;

import com.planon.employeeproject.employeebo.EmployeeBO;

/**
 * we have a company having employees with fields Name, Department and Salary.
 * Department can be categorized as Developer, Manager, Sales and Operation. we
 * have given different appraisal factor for different departments. we have to
 * calculate List of Employees with Incremented Salary in sorting order Desc on
 * Salary.
 */
public class Application {

	public static void main(String[] args) {

		EmployeeBO aEmployee = new EmployeeBO();
		aEmployee.getEmployees();

	}
}