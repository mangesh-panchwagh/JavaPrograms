package patterns_star;

import java.util.Scanner;

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
public class rightTrianglePattern {

	public static void main(String[] args) {

		System.out.println("Enter number you want : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		rightTriangle(n);
	}

	public static void rightTriangle(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
}
