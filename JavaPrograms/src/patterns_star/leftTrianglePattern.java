package patterns_star;

import java.util.Scanner;

//Enter number : 
//5
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
public class leftTrianglePattern {

	public static void main(String[] args) {

		System.out.println("Enter number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		leftTriangle(n);
	}

	public static void leftTriangle(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 2*(n - i); j>=0; j--) {
				
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
