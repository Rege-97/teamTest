package plus;

import java.util.Scanner;

public class PlusTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수를 입력하세요 :");
		int a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 :");
		int b = sc.nextInt();

		System.out.println(a + " + " + b + " = " + (a + b));

	}

}
