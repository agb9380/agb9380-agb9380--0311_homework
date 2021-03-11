package sugang0311;

public class Qus5 {

	public static void main(String[] args) {

		for (int i = 2; i < 101; i++) {
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0) {
					break;
				} else if (i == j) {
					System.out.println(i);
				}
			}
		}
	}
}