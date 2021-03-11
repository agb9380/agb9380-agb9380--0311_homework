package sugang0311;

import java.util.Scanner;

public class Qus2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("첫 번째 정수를 입력하세요.");
		int num1 =sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int num2 =sc.nextInt();
		System.out.println("세 번째 정수를 입력하세요.");
		int num3 =sc.nextInt();
		System.out.println("네 번째 정수를 입력하세요.");
		int num4 =sc.nextInt();
		
		int temp=0;
		int [] arr ={num1,num2,num3,num4};
		
		for (int i =0; i< arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]< arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println(arr[0]);
	}
}