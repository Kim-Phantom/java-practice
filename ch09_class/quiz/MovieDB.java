package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {

	private ArrayList<Movie> movielist = new ArrayList<Movie>();
	//싱글톤 팬턴
	public MovieDB() {
		movielist.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movielist.add(new Movie("기생충", "넌 계획이 다 있구나", "송강호", "ㄱㅅㅊ"));
	
		
	}
	//인스턴스 생성을 ㅅ해당 클래스에 하기 때문에(private)외부에서 못함.
	private static MovieDB instance = new MovieDB();
	//외부에서 접근
	public static MovieDB getInstance() {
		return instance;
	}
	//외부에서 접근
	public ArrayList<Movie> getmovielist(){
		return movielist;
	}
}