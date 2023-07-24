package ch05_contral;

import java.util.Scanner;

public class homework {

	private static Object scan1;

	public static void main(String[] args) {

		// q1

		Scanner scan = new Scanner(System.in);
		System.out.println("================");
		System.out.print("국어 점수를 입력해주세요 : ");
		int korea = Integer.parseInt(scan.nextLine());
		System.out.print("영어 점수를 입력해주세요 : ");
		int english = Integer.parseInt(scan.nextLine());
		System.out.print("수학 점수를 입력해주세요 : ");
		int math = Integer.parseInt(scan.nextLine());
		double avgResult = (korea + english + math) / 3;

		System.out.println("국어 : " + korea);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + avgResult);

		String grade = "";

		if (avgResult >= 90) {
			grade = "A";
		} else if (avgResult >= 80) {
			grade = "B";
		} else if (avgResult >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println(grade);

		// q2
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("숫자를 입력해주세요!");
		// int pack = scanner.nextInt();
		// for(int i = pack; i>=1; i++) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("팩토리얼 값을 원하는 숫자를 입력 하세요");
		int num = scanner.nextInt();
		long result = 1;

		for (int i = 1; i <= num; i++) {
			result *= i;

			System.out.println(num + "! = " + result);
		}

		System.out.println("결과 : " + result);

		// q3

		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int aCount = findWally.length() - findWally.replace("월리", "a").length();
		System.out.println("개수 :" + aCount);

		// q4
		int line = 6;
		String star = "";
		for (int a = 1; a <= 5; a++) { 
			String star1 = "*";
			for (int j = 1; j <= (line - 1) - a; j++) {
				star1 += "*";
			}
			System.out.println(star1);
		}

	}

}
