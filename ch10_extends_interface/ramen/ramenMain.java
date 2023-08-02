package ch10_extends_interface.ramen;

public class ramenMain {

	public static void main(String[] args) {
		//ramen ramen = new ramen("진라면", 1000) //추상클래스는 객체로 만들수 없음
		 jinramen jin = new jinramen("진라면 기본", 1200);
		 jin.printRecipe();
		 jjappagheti jja = new jjappagheti("짜파게티", 1200);
		 jja.printRecipe();
	}
}
