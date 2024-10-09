package patterns_star;

import java.util.Scanner;

//Enter the number : 
//5
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
public class pyramidPattern {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		pyramid(n);
	}

	public static void pyramid(int n) {

		for (int i = 1; i <=n; i++) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {

				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
}
