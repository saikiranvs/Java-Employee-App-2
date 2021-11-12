package com.planon.employeeproject.department;

public class Department {
	public String name;
	public double salary;
	public double appraisalfactor;

	/**
	 * Constructor Department() is used too initialize the data members of the
	 * class. (this) keyword works as a reference to the current Object, whose
	 * Method or constructor is being invoked.
	 * 
	 * @param aName            accepts name of the department.
	 * @param aSalary          accepts salary of an employee.
	 * @param aAppraisalfactor accepts appraisal factor of department.
	 */
	protected Department(String aName, double aSalary, double aAppraisalfactor) {
		this.name = aName;
		this.salary = aSalary;
		this.appraisalfactor = aAppraisalfactor;
	}

	/**
	 * this method calculates incremented salary of an Employee.
	 * 
	 * @return incremented salary of an Employee.
	 */
	public double getIncrementedSalary() {
		return this.salary + this.salary * this.appraisalfactor;
	}

	/**
	 * toString() method Returns a string representation of the object.
	 * 
	 */

	@Override
	public String toString() {
		return name;
	}

}