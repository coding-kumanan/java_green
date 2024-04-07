package org.col;

import org.staff.Staff;
import org.stu.Student;

public class College {
	private void colegeName() {
		System.out.println("RVS College of Enginnering");
	}

	public static void main(String[] args) {
		Student student = new Student();
		Staff staff = new Staff();
		College college = new College();
		
		student.stuName();
		student.stuId();
		student.stuDept();
		
		staff.stfId();
		staff.stfName();
		staff.stfDep();
		
		college.colegeName();
	}

}
