package stringPrograms;

import java.util.Scanner;

// Program to to check string is palindrome or not
public class palindromeString1 {

	public static void main(String[] args) {

		System.out.println("Enter string to check palindrome");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String reverseString = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			reverseString += s.charAt(i);
		}
		
		System.out.println("Reverse String is : " + reverseString);
		
		if(s.equals(reverseString)) {
			System.out.println("Entered String "+ s +" is palindrome.");
		}
		else {
			System.out.println("Entered String "+ s+" is not a palindrome.");
		}
	}
}
