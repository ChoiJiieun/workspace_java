package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		
		String num = scan.nextLine();
		int num2 = Integer.parseInt(num);
		
		if (num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
