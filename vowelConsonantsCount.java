package stringPrograms;

import java.util.Scanner;

public class vowelConsonantsCount {

	public static void main(String[] args) {

		System.out.println("Enter the String for vowel and consonent count : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int vowelCount = 0, consonentCount = 0;
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if( ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' ) {
				vowelCount ++;
			}
			else {
				consonentCount++;
			}
		}
		
		System.out.println("Vowel Count : " + vowelCount);
		System.out.println("Consonent Count : " + consonentCount);
	}
}
