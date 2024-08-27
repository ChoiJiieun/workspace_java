package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx2 {

	public static void main(String[] args) {
		int num = 298;
		
		String num1 = String.valueOf(num);
		
		int first = Integer.parseInt(num1.substring(0,1));
		int second = Integer.parseInt(num1.substring(1,2));
		int third = Integer.parseInt(num1.substring(2,3));
		
		System.out.println(first + second + third);	
		

	}

}
