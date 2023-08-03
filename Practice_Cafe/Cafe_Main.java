package Practice_Cafe;

import java.util.Scanner;

public class Cafe_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("행동을 선택해주세요");
		System.out.println("1.스타벅스|2.아카|3.사무실");
		System.out.println(">>>    ");
		int command = Integer.parseInt(scanner.nextLine());
		if(command == 1) {
			System.out.println("어서오세요 스타벅스 입니다");
			System.out.println(">>>   ");
			String id = scanner.nextLine();
		}
	}

}
