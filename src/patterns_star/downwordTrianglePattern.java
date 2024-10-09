package patterns_star;

import java.util.Scanner;

//* * * * * 
//* * * * 
//* * * 
//* * 
//* 
public class downwordTrianglePattern {

	public static void main(String[] args) {

		System.out.println("Enter number lines you want in pattern.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		downwordTriangle(n);
	}

	public static void downwordTriangle(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
}
