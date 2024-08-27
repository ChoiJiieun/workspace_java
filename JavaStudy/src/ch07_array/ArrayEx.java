package ch07_array;

public class ArrayEx {

	public static void main(String[] args) {
		// 문자편집 단축키 : shift + alt + a
		// 1. 우리반 학생들의 이름이 담긴 String[] 선언
		
		String[] students = { "강민호", "권철규", "김윤아", "김정인", "김혜원", 
							  "박정호", "서원빈", "안서령", "이소희", "이승욱", 
							  "이원호", "전영범", "전종화", "정도현", "최대준", 
							  "최지은", "한준희"};
		// 우리반 학생들의 이름을 출력
//		for (int i= 0; i < students.length; i++) {
//			System.out.println(students[i]);
//		}
//		
//		// 학생들의 이름에 출석부 순번을 붙여주세요 1. 강민호, 2. 권철규 ...
//		for (int i = 0; i < students.length; i++) {
//			// 배열의 첫 요소에서 부터 순회하며 변경
//			System.out.println((i + 1) + ". " + students[i]);
//		}
		
		// Q. 같은 성 찾기 메소드를 작성해주세요
		// input : String, String[]
		// output : x
		// 전달받은 배열에서 전달받은 성씨의 인원수를 출력
		// 호출 : searchNm("이", students)
		// 이소희씨, 이승욱씨, 이원호씨
		
		searchNm("이", students);
	}
	public static void searchNm(String name, String[] strName) {
		int count = 0;
		String result = "";
		for (int i = 0; i < strName.length; i++) {
			if (strName[i].indexOf(name) == 0) {
				count++;
				result = result + strName[i] + "씨 ";
			}
		}
		System.out.println(name + "씨 성을 가진 동기분은 총 " + count + "명 있습니다.");
		System.out.println(result);
	}

}
