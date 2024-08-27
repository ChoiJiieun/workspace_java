package ch04_operator;

import java.util.Scanner;

/**
 * Class Name   : OperatorMain
 * Author       : GJ
 * Created Date : 2024. 8. 6.
 * Version      : 1.0
 * Purpose      : operator study
 * Description  : 기본 연산자
 */

public class OperatorMain {

	public static void main(String[] args) {
		// 1. 증감 연사자
		int num = 10;
		num++;
		System.out.println("++ 이후 : " + num);
		num--;
		System.out.println("-- 이후 : " + num);
		
		// 주의 (연산자의 전, 후에 따라 다름)
		int a, b;
		a = num++; // 후
		b = ++num; // 전
		System.out.printf("a:%d, b:%d\n", a, b);
		
		// 2. 대입 연산자 +=, -=, *=, /=, %=
		int c = 1;
		c += 2;
		System.out.println("c: " + c);
		
		c *= 10;
		System.out.println("c: " + c);	
		
		// 3. 산술 연산자 +, -, *, /, %
		System.out.println(10+5);
		System.out.println(10%5); // 나머지 0
		
		// 4. 비교 연산자
		int num1 = 10;
		int num2 = 20;
		System.out.println("=== 비교 연산자 ===");
		System.out.printf("num1:%d, num2:%d\n", num1, num2);
		
		// 비교 연산자는 연산 후 true or false를 리턴
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		
		// 5. 삼항 연산자 (조건 연산자)
		System.out.println("=== 삼항 연산자 ===");
		// (a) ? (b) : (c) a의 조건식이 true이면 b 아니면 c
		String msg = (a > 9) ? "a가 10보다 큼" : "10보다 작음";
		System.out.println(msg);
		// 아이디는 10자리 이상
		System.out.println("아이디를 입력해주세요(10자리 이상)");
		System.out.print(">>> ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		int len = userInput.length();
		System.out.println("입력길이: "+ len);
		
		String message = len >= 10 ? "사용 가능합니다." : "10자리 이상으로 다시 작성";
		System.out.println(message);
		
		// 6. 논리 연산자 && (and 연산) 둘 다 true 일 때 true
		//              || (or 연산) 둘 중 1개만 true 일 때 true
		System.out.println("=== 논리 연산 ===");
		System.out.println("아이디를 입력하세요(8 ~ 14자리)");
		System.out.print(">>> ");
		
		String inputId = scan.nextLine();
		int idlen = inputId.length();
		String message2 = (idlen >= 8 && idlen < 15) ? "가능" : "불가능";
		System.out.println(message2);

	}

}
