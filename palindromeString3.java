package stringPrograms;

import java.util.Scanner;

//Program to to check string is palindrome or not using character Array
public class palindromeString3 {

	public static void main(String[] args) {

		System.out.println("Enter String for palindrome check : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		char[] charArray = s.toCharArray();
		String reverseString = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseString += charArray[i];
		}

		System.out.println("Reverse String is : " + reverseString);

		if (s.equals(reverseString))
			System.out.println("Entered String is palindrome");
		else
			System.out.println("Entered String is not a palindrome");
	}
}
