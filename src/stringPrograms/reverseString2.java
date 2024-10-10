package stringPrograms;

import java.util.Scanner;

public class reverseString2 {

	public static void main(String[] args) {

		System.out.println("Enter string for reverse : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char[] chArray = str.toCharArray();
		String revString = "";

		for (int i = chArray.length - 1; i >= 0; i--) {
			revString += chArray[i];
		}
		
		System.out.println("Reverse String is : " + revString);
	}
}
