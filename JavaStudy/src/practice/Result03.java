package practice;

import java.util.Scanner;

public class Result03 {

	public static void main(String[] args) {
		// Q. 3 업다운 게임
		// 1 ~ 50 사이의 랜덤 정수 생성
		// 기회는 5번

		Scanner scan = new Scanner(System.in);

		int randInt = (int) (Math.random() * 50 + 1); // Math.random() <-- 난수 생성 메소드 0 ~ 1 사이 실수
		System.out.println(randInt);

		int chance = 4;

		while (true) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = Integer.parseInt(scan.nextLine());

			if (num > randInt) {
				if (chance != 0) {
					System.out.println("다운!! 기회가 " + chance + "번 남았습니다.");
				}
			} else if (num < randInt) {
				if (chance != 0) {
					System.out.println("업!! 기회가 " + chance + "번 남았습니다.");
				}
			} else if (num == randInt) {
				System.out.println("정답입니다.");
				break;
			}

			if (chance == 0) {
				System.out.printf("실패하였습니다. 정답은 %s 입니다.", randInt);
				break;
			}

			chance--;
		}
		scan.close();

	}

}
