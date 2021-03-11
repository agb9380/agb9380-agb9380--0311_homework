package sugang0311;

import java.util.Scanner;

public class Qus4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		boolean search= true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				search = false;
			}
		}
		if (search == true) {
			System.out.println(num + "은/는 소수입니다");
		}else {
			System.out.println(num + "은/는 소수가 아닙니다.");
		}
	}
}
