package org.fullAbstract;

//we can extends more than one number of interfaces to achieve multiple inheritance
public interface PassWord extends UserName, example {
	
	public abstract void passWordValidation();//no implementation for abstract method
	
	
	static void mk() {
	System.out.println("From static method ");
	}
	 default void mk1() {
		System.out.println("From default method ");
		}
	 
}
