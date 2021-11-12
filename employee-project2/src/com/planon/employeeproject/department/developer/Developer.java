package com.planon.employeeproject.department.developer;

import com.planon.employeeproject.department.*;

public class Developer extends Department {
	/**
	 * Constructor Developer accepts the name salary and appraisalFactor of an
	 * employee. super() keyword is used to refer values to the base class
	 * Department.
	 * 
	 * @param aName            accepts name of the department.
	 * @param aSalary          accepts salary of an employee.
	 * @param aAppraisalfactor accepts appraisal factor of the department.
	 */

	public Developer(String aName, double aSalary, double aAppraisalfactor) {
		super(aName, aSalary, aAppraisalfactor);
	}

}
