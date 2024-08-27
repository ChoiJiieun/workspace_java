package ch05_conditional;

public class LoopFor {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		// 21 ~ 45를 더하면?
//		int sum2 = 0;
//		for (int i = 21; i <= 45; i++) {
//			sum2 += i;
//		}
//		System.out.println(sum2);
//		
//		// 1~40까지 중에 짝수만 더한 값은?
//		int sum_even = 0;
//		for (int i = 1; i <= 40; i++) {
//			if (i % 2 == 0) {
//				sum_even +=i;
//			}
//		}
//		System.out.println(sum_even);
		
		// 0 부터 시작해서 10번 * <-- 프린트 하시오
//		for (int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
		
//		int dan = 9;
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//		}
//		
//		// 10부터 1까지
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
//		
//		// 5씩 증가
//		for (int i = 1; i <= 100; i+=5) {
//			System.out.print(i + " ");
//		}
//		System.out.printf("\n");
		
		// 2 ~ 9단 출력
//		for (int i = 2; i <= 9; i++) {
//			System.out.println(i + " 단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d X %d = %d\n", i, j, i * j);
//			}
//			System.out.printf("\n");
//		}
		
		// 반복문에서 break 사용
		// 1 ~ n 까지 더한 값이 100 이상이 되는 지점의 n을 구하시오.
//		int sum5 = 0;
//		for (int i = 1; i < 9999; i++) {
//			sum5 += i;
//			if (sum5 >= 100) {
//				System.out.println("100 이상이 되는 n: " + i);
//				break;
//			}
//		}
		
		outer:
			for (int i = 0; i < 5; i++) {
				System.out.println("메인 for" + i);
				for (int j = 0; j < 5; j++) {
					System.out.println("서브 for"+ j);
					if (j == 2) {
						break outer;
					}
				}
			}
	}
}
