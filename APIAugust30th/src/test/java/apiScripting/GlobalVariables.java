package apiScripting;

public class GlobalVariables {

	// Global variables
	static int a = 200;		// static variable
	
	double d = 86.76;		// non-static variable or instance variable
	
	public static void main(String[] args) {
		
		a = 500;
		System.out.println("From main method : " + a);
		m1();
		
		// System.out.println(d);		// Cannot make a static reference to the non-static field d
		
		// Create object of class
		// Object is copy of the class where non-static members of the class there.
		GlobalVariables obj = new GlobalVariables();
		
		System.out.println(obj.d);
		obj.m2();
	}
	
	public static void m1() {
		a = 700;
		System.out.println("From m1() method : " + a);
	}
	
	public  void m2() {
		
		System.out.println("Running in m2()");
	}
}
