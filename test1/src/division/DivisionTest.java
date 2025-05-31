package division;

import java.util.Scanner;

public class DivisionTest {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫번째 수 입력 : ");
		int a = sc.nextInt();
		
		System.out.println("두번째 수 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("나누기 결과 : " + a + "/" + b + "=" + a/b);
		
	}

}
