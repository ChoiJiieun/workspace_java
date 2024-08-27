package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Result05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("행운의 로또 번호 생성기 입니다.");
		System.out.println("입력 값이 있으면 'y', 전체 자동으로 선택하려면 'n'을 입력하세요");
		String user = scan.nextLine();
		
		ArrayList<Integer> weekLotto = null;
		
		if (user.equals("y")) {
			System.out.println("번호를 한칸씩 띄어서 입력해주세요. 최대 6개");
			String[] numArr = scan.nextLine().split(" ");
			
			System.out.println("선택하신 번호는");
			System.out.println(Arrays.toString(numArr));
			
			weekLotto = makeLotto(numArr);
		} else if (user.equals("n")){
			weekLotto = makeLotto();
		}
		
		System.out.println("이번주 행운의 번호는 ♥");
		System.out.println(weekLotto.toString());
		System.out.println("GOOD LUCK ♥");

	}
	
	public static ArrayList<Integer> makeLotto(String[] strArr) {
		HashSet<Integer> numbers = new HashSet<>();
		
		for (int i = 0; i < strArr.length; i++) {
			int data = Integer.parseInt(strArr[i]);
			numbers.add(data);
		}
		
		while (numbers.size() < 6) {
			numbers.add((int) ((Math.random() * 45) + 1));
		}
		
		ArrayList<Integer> result = new ArrayList<>(numbers);
			
		Collections.sort(result);
		return result;
	}
	
	public static ArrayList<Integer> makeLotto() {
		HashSet<Integer> numbers = new HashSet<>();
		
		while (numbers.size() < 6) {
			numbers.add((int) ((Math.random() * 45) + 1));
		}
		
		ArrayList<Integer> result = new ArrayList<>(numbers);
		
		Collections.sort(result);
		return result;
	}

}
