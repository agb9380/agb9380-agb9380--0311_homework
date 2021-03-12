package sugang0311;

import java.util.Scanner;

public class Qus4 { //소수 판

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		boolean search= true; // 초기화를 true, false 무엇으로 하든 상관없음, true라고하면 소수라고 가정
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				search = false; // 약수가 존재하는지 안하는지에 대한 판단을 하고 싶은 경우는 boolean 형을 많이 사용함
				break;
			}
		}
		if (search == true) {
			System.out.println(num + "은/는 소수입니다");
		}else {
			System.out.println(num + "은/는 소수가 아닙니다.");
		}
	}
}
