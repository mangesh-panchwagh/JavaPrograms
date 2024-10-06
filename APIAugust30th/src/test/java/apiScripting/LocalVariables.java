package apiScripting;

public class LocalVariables {
	
	public static void main(String[] args) {
		
		// Local Variable
		int a;					// Declaration
		a = 300;				// Initialization
		System.out.println(a);	// Utilization
		
		// Declaration and Initialization in a single line
		boolean status = true;
		
		// you cannot make local variable as static
		//static byte b = 20;	// Illegal modifier for parameter b; only final is permitted
		
		final double pie = 3.147;
		
		// when any variable is defined as final, (in local only final allowed, not static) you cannot reassign the value
		
		 // pie = 3.188 ;
		 // The final local variable pie cannot be assigned. It must be blank and not using a compound assignment
		int b;	// Declaration
		
		// utilization without initialization
		//System.out.println(b);		// The local variable b may not have been initialized
		
		// For GLobal Variable automatic initialization of variable happens
		// It is advised that we always initialize  the variable with at least default value
		
	}
	
	public static void m1() {
		
		// Scope of a pie variable is not in any other method. Other than method in which it has been described 
		// System.out.println(pi);		// pi cannot be resolved to a variable
	}

}
