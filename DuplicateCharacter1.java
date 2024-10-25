package stringPrograms;

import java.util.Scanner;

public class DuplicateCharacter1 {

	public static void main(String[] args) {

		System.out.println("Enter the string to check Duplicate Characters : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {
					
				if(charArray[i] == charArray[j]) {
					System.out.print( charArray[i]+ " ");
				}
			}
		}
	}
}
