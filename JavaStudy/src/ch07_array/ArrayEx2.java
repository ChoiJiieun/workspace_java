package ch07_array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// Q. 월리를 찾아라!
		// findWally에는 월리가 몇개 들어있는지 출력해주세요
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int count = 0;
		int count2 = 0;
		
		// findWally 문자열에 월리를 공백으로 바꾼후 원래 문자열 길이에서 얼마나 줄어들었는지를 구하여 월리의 개수를 찾아냄
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length();
		count = (all - after) / 2;
		System.out.println("월리는 총: " + count);
		
		// findWally 문자열에서 2글자씩 나눠서 월리랑 비교
		for (int i = 0; i < findWally.length()-1; i++) {
			String subWally = findWally.substring(i, i+2);
			if (subWally.equals("월리")) {
				count2 += 1;
			}
		}
		
		System.out.println("월리는 총: " + count2);

	}

}
