package practice;

import java.util.Scanner;

public class Result04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a_ele = 10;
		int b_ele = 4;
		
		while(true) {
			System.out.println("============ 엘리베이터 ============");
			System.out.printf("승강기 A의 현재 위치: %d\n", a_ele);
			System.out.printf("승강기 B의 현재 위치: %d\n", b_ele);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");
			String user = scan.nextLine();
			
			if (user.equals("q") || user.equals("exit") || user.equals("Q") || user.equals("EXIT")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int user_floor = Integer.parseInt(user);
			
			String close_ali = "";
			
			if (Math.abs(user_floor - a_ele) > Math.abs(user_floor - b_ele)) {
				close_ali = "B";
				b_ele = user_floor;
			} else if (Math.abs(user_floor - a_ele) < Math.abs(user_floor - b_ele)) {
				close_ali = "A";
				a_ele = user_floor;
			} else {
				if (a_ele > b_ele) {
					close_ali = "A";
					a_ele = user_floor;
				} else {
					close_ali = "B";
					b_ele = user_floor;
				}
			}
			
			System.out.printf("엘리베이터 %s가 %s층으로 이동하였습니다.\n", close_ali, user_floor);
		}

	}

} 
