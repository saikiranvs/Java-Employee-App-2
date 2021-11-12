package com.planon.employeeproject.department.manager;

import com.planon.employeeproject.department.Department;

public class Manager extends Department {
	/**
	 * Constructor Manager accepts the name salary and appraisalFactor of an
	 * employee. super() keyword is used to refer values to the base class
	 * Department.
	 * 
	 * @param aName            accepts name of the department.
	 * @param aSalary          accepts salary of an employee.
	 * @param aAppraisalfactor accepts appraisal factor of department.
	 */
	public Manager(String aName, double aSalary, double aAppraisalfactor) {
		super(aName, aSalary, aAppraisalfactor);
	}

}
