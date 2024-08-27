package ch05_conditional;

public class ConditionalEx4 {

	public static void main(String[] args) {
		/*
		 * 거꾸로 트리를 5층 만들기
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		String star = "*****";
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(star.substring(0, i));
		}

	}

}
