package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	// 싱글톤 패턴
	// 인스턴스를 1개만 만들게 하는 방법 (최초에 한번만 메모리에 할당)
	// 메모리 낭비를 방지할 수 있으며, 단 하나의 객체로 존재해도 되는 클래스에 적용.
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("기생충", "넌 계획이 다 있구나", "송강호", "ㄱㅅㅊ"));
		movieList.add(new Movie("너의 이름은", "키미노 나마에와~", "미츠하", "ㄴㅇ ㅇㄹㅇ"));
	}
	// 인스턴스 생성을 해당 클래스에서 하기 때문에(private) 외부에서 인스턴스를 못 만듬
	
	private static MovieDB instance = new MovieDB();
	// 외부에서 접근
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
}
