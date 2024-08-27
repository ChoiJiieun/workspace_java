package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		// movieDB에는 심글톤 패턴으로 디자인되어 있어서
		// 외부에서 new를 할 수 없고 내부에서 생성되어진 하나의 인스턴스만을 사용할 수 있음
		
		MovieDB movieDB1 = MovieDB.getInstance();
		MovieDB movieDB2 = MovieDB.getInstance();
		System.out.println(movieDB1);  // 객체의 주소가 같음 (동일한 객체)
		System.out.println(movieDB2);
		
		// 영화 맞추기 게임
		// 1. 명대사 출력 맞추면 score + 3
		// 2. 틀리면 배우 출력 score + 2
		// 3. 틀리면 영화명 초성 출력 score + 1
		ArrayList<Movie> movieList = movieDB1.getMovieList();
		// collection shuffle (순서를 랜덤하게 섞음)
		Collections.shuffle(movieList);
		
		int score = 0;
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		while (i < movieList.size()) {
			String answer = movieList.get(i).getTitle();
			System.out.println(movieList.get(i).getQuotes()); // 명대사 출력
			System.out.print(">>> ");
			String user = scan.nextLine();
			
			if (answer.equals(user)) {
				System.out.println("정답입니다~!");
				score += 3;
				i++;
			} else {
				System.out.println(movieList.get(i).getActors()); // 배우 출력
				System.out.print(">>> ");
				user = scan.nextLine();
				
				if (answer.equals(user)) {
					System.out.println("정답입니다~!");
					score += 2;
					i++;
				} else {
					System.out.println(movieList.get(i).getWord()); // 배우 출력
					System.out.print(">>> ");
					user = scan.nextLine();
					
					if (answer.equals(user)) {
						System.out.println("정답입니다~!");
						score += 1;
						i++;
					} else {
						System.out.println("땡 틀렸습니다. 정답은 " + answer + " 입니다.");
						i++;
					}
				}
			}
		}
		
		System.out.printf("총점 %d 입니다.", score);		
		
	}

}
