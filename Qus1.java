package sugang0311;

import java.util.Scanner;

public class Qus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수를 입력하세요.");
		int num3 = sc.nextInt();

		if (num1 <= num2) {
			if (num2 <= num3) {
				System.out.printf("%d,%d,%d", num3, num2, num1);

			} else if (num2 > num3) {
				if (num3 >= num1) {
					System.out.printf("%d,%d,%d", num2, num3, num1);
				} else {
					System.out.printf("%d,%d,%d", num2, num1, num3);
				}
				System.out.println();
			}
		} else if (num1 > num2) {
			if (num1 >= num3) {
				if (num2 <= num3) {
					System.out.printf("%d,%d,%d", num1, num3, num2);
				} else if (num2 > num3) {
					System.out.printf("%d,%d,%d", num1, num2, num3);
				} else if (num1 < num3) {
					if (num1 <= num2) {
						System.out.printf("%d,%d,%d", num3, num2, num1);
					} else if (num1 > num2) {
						System.out.printf("%d,%d,%d", num3, num1, num2);
					}
				}

			} else if (num1 < num3) {
				System.out.printf("%d, %d, %d", num3, num1, num2);
			}
		}
	}
}
