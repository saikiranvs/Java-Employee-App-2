package com.planon.employeeproject.services.dataservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.planon.employeeproject.department.Department;

public class DataServices {

	protected Connection con;
	protected static PreparedStatement ps;
	protected ResultSet rs;

	/**
	 * insertOperation() method accepts name, department and salary parameters. and
	 * inserts values into the database.
	 * 
	 * @throws SQLException An exception that provides information on a database
	 *                      access error or other errors.
	 */
	public void insertOperation(String aName, Department aDepartment, double aSalary) throws SQLException {
		try {
			String userName = "l";
			String password = "l";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://PC09362;instanceName=SQLEXPRESS";
			con = DriverManager.getConnection(url, userName, password);

			ps = con.prepareStatement("insert into pla values(?,?,?)");
			ps.setString(1, aName);
			ps.setString(2, aDepartment.toString());
			ps.setFloat(3, (float) aSalary);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		con.close();
	}

}
