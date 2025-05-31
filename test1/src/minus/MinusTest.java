package minus;

import java.util.Scanner;

public class MinusTest {

	public static void main (String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력 하세요");
		int a = scn.nextInt();
		
		System.out.print("두번째 수를 입력 하세요");
		int b = scn.nextInt();
		
		System.out.println(a+"-"+b+" 는 "+(a-b)+" 입니다");
		
	}
}
