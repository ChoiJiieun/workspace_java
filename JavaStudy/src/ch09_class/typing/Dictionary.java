package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	// 전연적으로 사용하는 상수
	public static final int OPTION_STUDENT_NAME = 0; // 보통 상수는 대문자로
	public static final int OPTION_CODING_WORD = 1;
	public static final int OPTION_RANDOM_ALPHABET = 2;
	
	// 타자연습 게임을 위한 단서 생성기
	public static ArrayList<String> makeWordList(int option) {
		ArrayList<String> result = new ArrayList<String>();
		
		// option 0 학생이름, 1 코딩용어, 2 랜덤 알파벳
		if (option == OPTION_STUDENT_NAME) {
			result.add("kim pangsu");
			result.add("kang minho");
			result.add("kwon cheolgyu");
			result.add("kim yoona");
			result.add("kim jungin");
			result.add("kim hyewon");
			result.add("park jungho");
			result.add("seo wonbin");
			result.add("ahn seoryeong");
			result.add("lee sohee");
			result.add("lee seungwook");
			result.add("lee wonho");
			result.add("jeon youngbeom");
			result.add("jeon jonghwa");
			result.add("jung dohyun");
			result.add("choi daejun");
			result.add("choi jieun");
			result.add("han junhee");
		} else if (option == OPTION_CODING_WORD) {
			result.add("Class");
			result.add("static");
		} else if (option == OPTION_RANDOM_ALPHABET) {
			// 랜덤 알파벳 6자리
			// 10개 생성
			String[] alphabet = "qwertyuiopasdfghjklzxcvbnm".split("");
			
			int randint = 0;
			
			for (int i = 0; i < 10; i++) {
				String randWord = "";
				for (int j = 0; j < 6; j++) {
					randint = (int) (Math.random() * alphabet.length);
					randWord = randWord + alphabet[randint];
				}
				result.add(randWord);
			}
			
		}
		
		return result;
	}
}
