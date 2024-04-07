package datatype.org;

public class DataTypeExample {

	public static void main(String[] args) {
	
		byte age = 34;
		System.out.println("The Age is " + age);
		
		int nineDigitRoleNumber = 540630331;
		System.out.println("The Role Number is " + nineDigitRoleNumber);
		
		short serialNumber = 4341;
		System.out.println("The Role Number is " + serialNumber);
		
		long departmentNumber = 7898232323232322276l;
		System.out.println("The Department Number is " + departmentNumber);
		
		float weight = 85.1432f;
		
		double height = 5.1234567891234567;
		
		System.out.println("My weight is " + weight + " kg"+ "\nMy Height is " + height +" meter" );
		
		char intial = 'M';
		String name = "kumanan";
		boolean answer = true;
		
		System.out.println(String.format("My Name is %s.%s and the answer is "+ answer, intial, name));

	}

}
