package practice;

public class Result02 {

	public static void main(String[] args) {
		int factorial10 = 1;
		for (int i = 10; i >= 1; i--) {
			factorial10 *= i;
		}
		System.out.println("10 팩토리얼의 값은 : " + factorial10);
		
		long factorial15 = 1;
		for (int i = 15; i >= 1; i--) {
			factorial15 *= i;
		}
		System.out.println("15 팩토리얼의 값은 : " + factorial15);
	}

}
