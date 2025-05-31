package multiplication;

import java.util.Scanner;

public class MultiplicationTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번쨰 수를 입력하세요:");
		int x=sc.nextInt();
		System.out.print("두번쨰 수를 입력하세요:");
		
		int y=sc.nextInt();
		
		System.out.println("결과:"+x+" x "+y+"="+x*y);
	}

}
