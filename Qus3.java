package sugang0311;

import java.util.Scanner;

public class Qus3 {

	public static void main(String[] args) {

		int height = 0;
		int time = 0;

		while (height != 100) {
			time++;
			if (height < 50) {
				height += 4;
			} else {
				height += 3;
			}
			System.out.printf("%d 시간후 달팽이가 올라간 총 높이: %dm \n ", time, height);
		}

	}

}