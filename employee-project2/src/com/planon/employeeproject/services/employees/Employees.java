package com.planon.employeeproject.services.employees;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.planon.employeeproject.department.Department;
import com.planon.employeeproject.department.developer.Developer;
import com.planon.employeeproject.department.manager.Manager;
import com.planon.employeeproject.department.operation.Operation;
import com.planon.employeeproject.department.sales.Sales;
import com.planon.employeeproject.employeebo.EmployeeBO;
import com.planon.employeeproject.employeedto.EmployeeDTO;
import com.planon.employeeproject.services.EmployeeService;
import com.planon.employeeproject.services.dataservices.DataServices;

/**
 * method getAllEmployees() accepts list of Employees returned by the EmployeeBO
 * class and sorts the list in Desc on Salary of an Employee.
 * 
 * @author saveer
 *
 */
public class Employees implements EmployeeService {
	/**
	 * 
	 * @return listofEmoployees contains name, department and salary of an Employee.
	 */
	@Override
	public List<EmployeeDTO> getEmployees() {
		List<EmployeeDTO> listofEmployees = new ArrayList<EmployeeDTO>();

		Department department = new Sales("Sales", 480000, 0.1);
		EmployeeDTO employee = new EmployeeDTO("Joey", department);
		listofEmployees.add(employee);

		department = new Operation("Operation", 550000, 0.08);
		employee = new EmployeeDTO("Ross", department);
		listofEmployees.add(employee);

		department = new Manager("Manager", 450000, 0.12);
		employee = new EmployeeDTO("Monica", department);
		listofEmployees.add(employee);

		department = new Sales("Sales", 600000, 0.1);
		employee = new EmployeeDTO("Phoebe", department);
		listofEmployees.add(employee);

		department = new Developer("Developer", 530000, 0.15);
		employee = new EmployeeDTO("Chandler", department);
		listofEmployees.add(employee);

		department = new Operation("Operation", 580000, 0.08);
		employee = new EmployeeDTO("Rachel", department);
		listofEmployees.add(employee);

		return listofEmployees;

	}

	public void getEmployeeData() {
		EmployeeBO employee = new EmployeeBO();
		List<EmployeeDTO> employees = employee.getEmployees();
		DataServices data = new DataServices();

		for (EmployeeDTO aEmployees : employees) {
			try {
				data.insertOperation(aEmployees.getName(), aEmployees.getDepartment(),
						aEmployees.getIncrementedSalary());
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
