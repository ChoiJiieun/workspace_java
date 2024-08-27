package ch06_method;

/**
 * Class Name   : RecursionMain
 * Author       : GJ
 * Created Date : 2024. 8. 8.
 * Version      : 1.0
 * Purpose      : method
 * Description  : recursion function
 */
public class RecursionMain {

	public static void main(String[] args) {
		System.out.println(reFatorial(10));

	}
	
	// factorial 재귀함수 사용
	public static long reFatorial(int num) {
		if (num == 1) { // 재귀함수는 멈추는게 중요한 (잘못작성하면 무한루프)
			return 1;
		}
		return num * reFatorial(num - 1);
		/*
		 * 3을 입력 받았다면
		 * 3 * reFatorial(2)
		 * 3 * 2 * reFatorial(1)
		 */
	}

}
