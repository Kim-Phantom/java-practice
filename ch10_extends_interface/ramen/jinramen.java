package ch10_extends_interface.ramen;

public class jinramen extends ramen{
	public jinramen(String name, int price) {
		super(name, price);
	}
	@Override
	public void printRecipe() {
		System.out.println("끊는 물에 면과 스프를 넣고 3분후에 드셔요");
	    System.out.println("anfdms 500ml (한강라면은 스탈은 400ml)");
	}

}
