package org.polymorexample;

import java.util.Scanner;

public class MethodOverLoad {
	public void empId() {
		System.out.println("Employe Id is 101");
	}
	public void empId(int empId) {
		System.out.println("Employe Id is "+empId);
		
	}
	public void empId(int empId,String name) {
		System.out.println("Employe Id is " +empId+"\nEmploye name is "+name);
	}
	public void empId(String name, int empId) {
		System.out.println("Employe name is "+name+"\nEmployee id is "+empId);
		
	}
}
