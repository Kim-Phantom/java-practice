package ch05_contral;

import java.util.Scanner;

public class PoketGame01 {

	public static void main(String[] args) {
		int enemyHP = 100;
		Scanner scanner = new Scanner(System.in);
		outer: while(true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해 주세요.");
			System.out.println("1.공격 || 2.도망");
			System.out.println(">>>  ");
			int command = Integer.parseInt(scanner.nextLine());
			if(command ==1) {
				while(true) {
					System.out.println("공격 방법 선택!");
					System.out.println("1.백만볼트 | 2.전광석화 | 3.취소");
					System.out.println(">>>  ");
					int select = Integer.parseInt(scanner.nextLine());
					if(select == 1) {
						System.out.println("피~~~~카~~~~~~~~~~~~~~츄");
						enemyHP -=20;
					}else if(select ==2) {
						System.out.println("삐까삐까!!");
						enemyHP -=10;
					}else if(select ==3) {
						System.out.println("공격취소");
						break;
						
					}
					System.out.println("파이리의 현재 체력 :" + enemyHP);
					if(enemyHP <=0) {
						System.out.println("파이리를 잡았다!!!");
						//outer 시점 while문 중지
						break outer;
					}
				}
			}
		}
	}

}
