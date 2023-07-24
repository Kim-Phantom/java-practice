package ch04_operator;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//q1
   Scanner scan = new Scanner(System.in);
   
   System.out.println("================");
   System.out.print("이름을 입력하세요 : ");
   String name = scan.nextLine();
   System.out.print("국어 점수를 입력해주세요 : ");
   int korea = Integer.parseInt(scan.nextLine());
   System.out.print("영어 점수를 입력해주세요 : ");
   int english = Integer.parseInt(scan.nextLine());
   System.out.print("수학 점수를 입력해주세요 : ");
   int math = Integer.parseInt(scan.nextLine());
   double avgResult = (korea + english + math) /3;
   
   
   System.out.println("이름 : "+ name);
   System.out.println("국어 : "+ korea);
   System.out.println("영어 : "+ english);
   System.out.println("수학 : "+ math);
   System.out.println("평균 : "+ avgResult);
   
   //q2
   System.out.println("당신의 주민번호를 입력하세요. (000000-0000000)");
   String num = scan.nextLine();
   char gender = num.charAt(7);
   char year = num.charAt(0);
   String year1;
   String gender1;
   if(gender =='1') {gender1 ="남자";}
   else if (gender == '2') {gender1 = "여자";}
   else {gender1 = "성별이 없습니다.";}
   if (year >= '3') {year1 = "2000년 이전";}
   else {year1 = "2000년 이후";}
   System.out.println("당신은" + year1 + "에 출생한 " + gender1 + "입니다.");
   scan.close();
		   
		    
   }
   
   
   
	}


