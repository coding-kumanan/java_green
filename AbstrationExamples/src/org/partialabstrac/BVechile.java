package org.partialabstrac;
//partial abstract class
//in partial abstraction we use abstract class and abstract method
public abstract class BVechile extends Abrand {
	//Abstract method 
	 abstract void typeOfVechile();
	 abstract void typeOfEngine();
	 abstract void seatCapacity();
	 abstract void go();
	 abstract void stop();
	 abstract void reverse();
	
	public void describeVechile() {
		System.out.println("Vechile is used to move man or goods from point A to B\n Its catagaried like "
				+ "Car, bus, lorry etc");
	}

}
