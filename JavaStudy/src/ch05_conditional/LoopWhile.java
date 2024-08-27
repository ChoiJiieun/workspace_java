package ch05_conditional;

import java.util.Scanner;

/**
 * Class Name   : LoopWhile
 * Author       : GJ
 * Created Date : 2024. 8. 7.
 * Version      : 1.0
 * Purpose      : 반복문
 * Description  : while
 */

public class LoopWhile {

	public static void main(String[] args) {
		// while(조건식) 조건이 true이면 반복 (무한루프 조심)
//		int i = 1;
//		
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		boolean flag = true;
//		while(flag) {
//			System.out.println("==============");
//			System.out.println("이름을 입력하시오.(종료 q)");
//			
//			String nm = scan.nextLine();
//			
//			if (nm.equals("q")) {
//				flag = false;
//			} else {
//				System.out.println(nm + "님 환영합니다.");
//			}
//		}
		
		int i = 2;
		while (i <= 9) {
			System.out.println(i + " 단");
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
		}

	}

}
