package ch06_method;

/**
 * Class Name   : MethodMain
 * Author       : GJ
 * Created Date : 2024. 8. 8.
 * Version      : 1.0
 * Purpose      : method
 * Description  : java의 함수 클래스에 종속되어 있는 method
 */

public class MethodMain {
	// main 메소드 public이며 static하여 어디서든 사용가능하고 void는 리턴이 없을때 사용
	// 매개변수 한개 (String[] 배열 타입)
	public static void main(String[] args) {
		printSum(1, 100); // 메소드 실행
		int resultSum = returnSum(10, 190);
		
		// Ctrl + 메소드 클릭 (메소드 선언 내용으로 이동)
		// Alt + <- 방향키 (이전 코드로 이동)
		print(resultSum);
		print("출력 함수");
		
		System.out.println(factorial(10));

	}
	
	public static void printSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.printf("from : %d 부터 to: %d 까지 합은 : %d\n", from, to, sum);
	}
	
	public static int returnSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	// 메소드 오버로딩 동일한 이름의 메소드를 다른 입력과, 다른 리턴으로 정의할 수 있음.
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	public static long factorial(int num) {
		int f_num = 1;
		for (int i = num; i >= 1; i--) {
			f_num *= i;
		}
		return f_num;
	}

}
