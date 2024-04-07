package org.polymorexample;

public class OverrideExample extends PolyExOverride {
	@Override 
	public void esmp1(String name) {
		super.esmp1(name);
		System.out.println("override logic");
	}
	@Override
	public void esmp1(float height) {
		super.esmp1(height);
		System.out.println("overide logic");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideExample ex = new OverrideExample();
		ex.esmp1("mk");
		ex.esmp1(5.5f);

	}

}
