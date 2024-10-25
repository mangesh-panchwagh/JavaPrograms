package stringPrograms;

import java.util.Scanner;

public class reverseString1 {

	public static void main(String[] args) {

		System.out.println("Enter the String for reverse : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String revString = "";
		System.out.println("Entered String is : " + s);
		
		for (int i = s.length() - 1; i >= 0; i--) {
			revString += s.charAt(i);
		}
		System.out.println("Revese String is : " + revString);
	}

}
