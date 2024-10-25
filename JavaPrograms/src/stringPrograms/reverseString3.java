package stringPrograms;

import java.util.Scanner;

public class reverseString3 {

	public static void main(String[] args) {
		
		System.out.println("Enter String for Reversing it : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder revString = sb.reverse();
		System.out.println("Reverse String is : " + revString);
	}
}
