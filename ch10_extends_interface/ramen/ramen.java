package ch10_extends_interface.ramen;

public abstract class ramen {
//abstract <-- 를 class앞에 표기
//상속을 통한 확장만 허용, 자체적으로는 객체를 생성 못함
//추상클래스는 메서드의 기본저긴 구조를 정의하고
//,하위 클래스에서 재정의하거나 확자하여 사용
	String name;
	int price;
	public ramen(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	public abstract void printRecipe();
}
