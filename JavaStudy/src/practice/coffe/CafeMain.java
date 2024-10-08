package practice.coffe;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 스타벅스와 아카 카페 생성
        Cafe starbucks = new Cafe("스타벅스");
        Cafe aka = new Cafe("아카");

        // 대표 음료 추가
        starbucks.addCoffee(new Coffee("아메리카노", 5000));
        starbucks.addCoffee(new Coffee("카푸치노", 6000));
        starbucks.addCoffee(new Coffee("오곡라떼", 7000));

        aka.addCoffee(new Coffee("아메리카노", 2500));
        aka.addCoffee(new Coffee("바닐라라떼", 3000));
        aka.addCoffee(new Coffee("아이스티", 3500));

        while (true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀...");
            System.out.print(">>> ");
            int action = sc.nextInt();

            if (action == 1) {
                starbucks.showMenu();
                starbucks.buyCoffee(sc);
            } else if (action == 2) {
                aka.showMenu();
                aka.buyCoffee(sc);
            } else if (action == 3) {
                System.out.println("사무실로 복귀합니다...");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }

        sc.close();
	}

}
