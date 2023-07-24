package ch05_contral;

import java.util.Scanner;

public class ch5_ex3 {

	
		public static void main(String[] args) {
			//메뉴를 입력받아 가격을 출력하는 프로그램을 작성하시오
			//(아이스아메이카노는 호칭이 2개)
			
			//아아 or 아이스아메리카노 : 3000
			//라떼 : 4500
			//에스프레소 :2500
			//위의 메뉴로 입력하면 "입력메뉴"는 000원 입니다. 출력
			//위의 메뉴가 아닌 메뉴는 "입력메뉴"메뉴는 저희 매장에 없습니다. 출력
			int salePrice = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("메뉴를 주문하세요");
			System.out.println(">>>");
			String menu = scanner.nextLine();
			switch(menu) {
			case "아이스아메리카노":
			case "아아":
			salePrice = 3000;
			System.out.println("아이스아메리카노" + salePrice + "입니다.");
			break;
			case "아떼":
			salePrice = 4500;
			System.out.println("라떼" + salePrice + "입니다.");
			break;
			case "에스프레소":
			salePrice = 2500;
			System.out.println("에스프레소" + salePrice + "입니다.");
			break;
			}
		}
	}
	

