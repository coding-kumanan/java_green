package org.fullAbstract;

public class Login implements UserName, PassWord {

	@Override
	public void passWordValidation() {
		System.out.println("Valid password");
		
	}

	@Override
	public void userValidation() {
		System.out.println("Valid user");
		
	}
	
}
