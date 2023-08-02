package ch10_extends_interface.ramen;

public class jjappagheti extends ramen{
	
	public jjappagheti(String name, int price) {
		super(name, price);
		
	}
	@Override
	public void printRecipe() {
		System.out.println("끊는물에 면을 삻은");
	}
	
}
