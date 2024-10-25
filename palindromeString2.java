package stringPrograms;

import java.util.Scanner;

//Program to to check string is palindrome or not using function
public class palindromeString2 {

	public static void main(String[] args) {

		System.out.println("Enter string to check palindrome : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		boolean res = palindromeString(s);

		if (res)
			System.out.println("Entered String is palindrome.");
		else {
			System.out.println("Entered String is not a palindrome.");
		}
	}

	public static boolean palindromeString(String s) {

		String reverseString = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			reverseString += s.charAt(i);
		}

		System.out.println("Reverse String is : " + reverseString);

		if (s.equals(reverseString))
			return true;
		else
			return false;
	}

}
