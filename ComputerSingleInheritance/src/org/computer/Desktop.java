package org.computer;

public class Desktop extends ComputerModel{
	
	private void desktopSize() {
		System.out.println("22-INCH");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop config = new Desktop();
		
		config.compute();
		config.desktopSize();

	}

}
