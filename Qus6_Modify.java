package sugang0311;

import java.util.Arrays;
import java.util.Scanner;

public class Qus6_Modify {

	public static void main(String[] args) {
		
		
		
		System.out.println("10개의 정수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int [] Arr = new int[10];
		
		for (int i=1; i<Arr.length; i++) {
			Arr[i] = sc.nextInt();
		}
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("첫 번째 정수를 입력하세요.");
		 * int num1 = sc.nextInt(); System.out.println("두 번째 정수를 입력하세요."); int num2 =
		 * sc.nextInt(); System.out.println("세 번째 정수를 입력하세요."); int num3 = sc.nextInt();
		 * System.out.println("네 번째 정수를 입력하세요."); int num4 = sc.nextInt();
		 * System.out.println("다섯 번째 정수를 입력하세요."); int num5 = sc.nextInt();
		 * System.out.println("여섯 번째 정수를 입력하세요."); int num6 = sc.nextInt();
		 * System.out.println("일곱 번째 정수를 입력하세요."); int num7 = sc.nextInt();
		 * System.out.println("여덟 번째 정수를 입력하세요."); int num8 = sc.nextInt();
		 * System.out.println("아홉 번째 정수를 입력하세요.."); int num9 = sc.nextInt();
		 */

		int sum1 = 0;
		int sum2 = 0;
		int even_sum = 0;
		int odd_sum = 0;

		int[] i_array = new int[10];
		int[] d_array = new int[10];

		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] % 2 == 0) {
				even_sum += Arr[i];
				i_array[i] += Arr[i];
			} else {
				odd_sum += Arr[i];
				d_array[i] += Arr[i];
			}
		}
		for (int i = 0; i < i_array.length; i++) {
			sum1 += i_array[i];
		}
		for (int i = 0; i < d_array.length; i++) {
			sum2 += d_array[i];
		}
		System.out.println("<짝수>\n" + Arrays.toString(i_array));
		System.out.println("짝수의 합 :" + sum1);
		System.out.println("<홀수>\n" + Arrays.toString(d_array));
		System.out.println("홀수의 합 :" + sum2);
	}
}

/*
	종범씨...
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("세 번째 정수를 입력하세요.");
		int num3 = sc.nextInt();
		System.out.println("네 번째 정수를 입력하세요.");
		int num4 = sc.nextInt();
		System.out.println("다섯 번째 정수를 입력하세요.");
		int num5 = sc.nextInt();
		System.out.println("여섯 번째 정수를 입력하세요.");
		int num6 = sc.nextInt();
		System.out.println("일곱 번째 정수를 입력하세요.");
		int num7 = sc.nextInt();
		System.out.println("여덟 번째 정수를 입력하세요.");
		int num8 = sc.nextInt();
		System.out.println("아홉 번째 정수를 입력하세요..");
		int num9 = sc.nextInt();

	이 코드를 짜면서 욱했을거 같은데요??? ^^
	배열을 이용해서 입력받으면.... 
	int[] arr = { num1, num2, num3, num4, num5, num6, num7, num8, num9 };

	이런 초기화도 구성할 필요가 없습니다.
	다시 한번 해보세요~~
*/
