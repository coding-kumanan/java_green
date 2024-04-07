package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("Employee ID : 210");
	}
	private void empName() {
		System.out.println("Employee Name : Raj");
	}
	private void empDob() {
		System.out.println("Employe DOB : 19-10-1990");
	}
	private void empPhone() {
		System.out.println("Employee PhoneNo : +919489952245");
	}
	private void empEmail() {
		System.out.println("Employee Email_id : emp@gmail.com");
	}
	private void empAddress() {
		System.out.println("Employee Address : fake street, Chennai-60018");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empDetails = new Employee();
		empDetails.empId();
		empDetails.empName();
		empDetails.empDob();
		empDetails.empPhone();
		empDetails.empEmail();
		empDetails.empAddress();

	}

}
