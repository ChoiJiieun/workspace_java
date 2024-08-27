package ch05_conditional;

/**
 * Class Name   : ConditionalMain2
 * Author       : GJ
 * Created Date : 2024. 8. 7.
 * Version      : 1.0
 * Purpose      : 
 * Description  : 
 */

public class ConditionalMain2 {

	public static void main(String[] args) {
		int num = 1;
		
		switch (num) {
		case 0:
			System.out.println("수강등록");
			break;
		case 1:
			System.out.println("기초 프로그래밍");
			break;
		case 2:
			System.out.println("취업관련");
			break;
		default:
			System.out.println("종료");
		}
		
		// 문자열 비교
		String a = "팽수"; // java 7 이상에서 문자열도 == 비교 가능
		if(a == "팽수") {
			System.out.println("팽수다");
		}

	}

}
