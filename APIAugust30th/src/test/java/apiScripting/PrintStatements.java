package apiScripting;

public class PrintStatements {

	public static void main(String[] args) {
		
		System.out.print("Welcome" + "\n");
		System.out.print("Good" + "\n");
		System.out.print("Morning" + "\n");

		System.out.println("-------------------------------");
	
		System.out.println("Welcome");
		System.out.println("Good");
		System.out.println("Morning");
		
		System.out.println("-------------------------------");
		
		// Between 2 integer values if + sign exists it does the arithmetic operation
		System.out.println(10 + 2);	//12
		
		// Between 2 string values + sign acts as concatenating operator (it joins)
		System.out.println("10" + "2");	//102
		
		// Between a string value and a number + sign acts as concatenating operator (it joins)
		System.out.println("10" + 2);	//102
		
		// Between character and number if + sign exists it does arithmetic operation & character converts to its ASCII value
		System.out.println("-------------------------------");
		System.out.println('a' + 0);	// 97
		System.out.println('b' + 0);	// 98
		System.out.println('A' + 0);	// 65
		System.out.println('B' + 0);	// 66
		System.out.println('?' + 0);	// 63
		
		System.out.println("My All India Rank is " + 3500);		//My All India Rank is 3500
		
		// 2 input at a time movement starts from left to right
		System.out.println("My age is " + 20 + 2 + 8 + 2);		// My age is 20282
		System.out.println("My age is " + (20 + 2 + 8 + 2));	// 32		
			
	}

}
