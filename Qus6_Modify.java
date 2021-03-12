package sugang0311;

import java.util.Arrays;
import java.util.Scanner;

public class Qus6_Modify {

	public static void main(String[] args) {
		
		
		
		System.out.println("10개의 정수를 입력하세요 :");   // 배열을 이용해서 수정했음
		Scanner sc = new Scanner(System.in);
		int [] Arr = new int[10];
		
		for (int i=1; i<Arr.length; i++) {
			Arr[i] = sc.nextInt();
		}
		

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

