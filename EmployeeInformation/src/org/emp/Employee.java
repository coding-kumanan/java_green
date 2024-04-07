package org.emp;
import org.client.*;
import org.company.*;
import org.project.*;

public class Employee {
	private void empName() {
		System.out.println("Employee Name: Nandini");
	}

	public static void main(String[] args) {
		// object creation
		Client client = new Client();
		Company company = new Company();
		Employee employee = new Employee();
		Project project = new Project();
		
		// object method call
		
		project.projectName();
		client.clientName();
		company.companyName();
		employee.empName();
		
		
	}

}
