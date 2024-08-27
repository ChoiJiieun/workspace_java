package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx3 {

	public static void main(String[] args) {
		// 커피 주문
		// 아아 or 아메리카노 : 3000
		// 카푸치노 : 4500
		// 밀크티 : 5000
		// 만약 해당 메뉴가 없으면 "메뉴 없습니다." 출력
		
		// 1. 주문 받기
		// 2. 조건문
		// 3. 해당 조건의 값 할당
		// 4. 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("어떤걸 드릴까요? >> ");
		String menu = scan.nextLine();
		
		switch (menu) {
		case "아아":
		case "아메리카노":
			System.out.println("3000원 입니다.");
			break;
		case "카푸치노":
			System.out.println("4500원 입니다.");
			break;
		case "밀크티":
			System.out.println("5000원 입니다.");
			break;
		default:
			System.out.println("메뉴가 없습니다.");
		}
		
		scan.close();
		
	}

}
