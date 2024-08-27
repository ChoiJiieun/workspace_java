package ch06_method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		/*
		 * input :  고객수
		 * output :  없음
		 * 고객수 만큼 커피 주문을 받아 금액을 출력하는 메소드 생성
		 */
		
		shop(2);

	}
	
	public static void shop(int num) {
		System.out.println(num + " 고객 출현");
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		while(num > i) {
			// 주문 받기
			System.out.println((i + 1) + "번째 고객님 어떤걸로 드릴까요?");
			String menu = scan.nextLine();
			int price = 0;
			
			switch (menu) {
				case "아아":
				case "아메리카노":
					price = 3000;
					break;
				case "카푸치노":
					price = 4500;
					break;
				case "밀크티":
					price = 5000;
					break;
				default:
					System.out.println("메뉴가 없습니다.");
			}
			
			if (price > 0) {
				i++;
				System.out.println("선택한 음료는 " + price + "원 입니다.");
			}
		}
		scan.close();
		System.out.println(num + " 고객 주문 완료");
	}

}
