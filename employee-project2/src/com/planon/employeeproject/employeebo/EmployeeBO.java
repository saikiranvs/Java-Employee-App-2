package com.planon.employeeproject.employeebo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.planon.employeeproject.employeedto.EmployeeDTO;
import com.planon.employeeproject.services.employees.Employees;

public class EmployeeBO {
	/**
	 * sorts the list of Employees and returns.
	 * 
	 * @return listofEmoployees contains name, department and salary of an Employee.
	 */
	public List<EmployeeDTO> getEmployees() {

		Employees employee = new Employees();
		List<EmployeeDTO> employees = employee.getEmployees();

		Collections.sort(employees, new Comparator<EmployeeDTO>() {

			@Override
			public int compare(EmployeeDTO aFirstEmployee, EmployeeDTO aSecondEmployee) {
				return Double.compare(aFirstEmployee.getIncrementedSalary(), aSecondEmployee.getIncrementedSalary());
			}
		});
		Collections.reverse(employees);
//		for (EmployeeDTO aEmployees : employees) {
//			System.out.println(aEmployees.toString());
//		}

		employee.getEmployeeData();

		return employees;
	}
}