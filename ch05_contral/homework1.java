package ch05_contral;

import java.net.MulticastSocket;
import java.util.Scanner;

import ch03_system.systemMain;

public class homework1 {

	//q1
	public static void main(String[] args) {
      int circle = 360;
      boolean str = true;
      Scanner scanner = new Scanner(System.in);
      outer:while(str = true) {
    	  System.out.println("숫자를 입력해 주세요");
    	  System.out.println(">>>   ");
    	  int command = Integer.parseInt(scanner.nextLine());
    	  while(true) {
    		  if(command % circle >= 0 && command % circle < 60) {
    			System.out.println(command / circle + "바퀴 돌았으며 사탕입니다");
    			break;
    		  }else if (command % circle >= 60 && command % circle < 120) {
    			  System.out.println(command / circle + "바퀴 돌았으며 초콜릿입니다");
    			  break; 
    		  }else if (command % circle >= 120 && command % circle < 180){
    			  System.out.println(command / circle + "바퀴 돌았으며 쿠키입니다");
    			  break;
    		  }else if (command % circle >= 180 && command % circle < 240) {
    			  System.out.println(command / circle + "바퀴 돌아으며 콜라입니다");
    			  break;
    		  }else if (command % circle >= 240 && command % circle < 300) {
    			  System.out.println(command /circle + "바퀴 돌았으며 아이스크림 입니다");
    			  break;
    		  }else if (command % circle >= 300 && command % circle < 360) {
    			  System.out.println(command / circle + "바퀴 돌았으며 커피입니다.");
    			 break;
    		  }else if (command < 0)
    			  System.out.println("프로그램을 종료합니다");
    		    break outer;
    	  }
      }
		
		
		
		
		
		
		
	//q2
	Scanner s = new Scanner(System.in);
	int j;
	System.out.println("문자를 입력해주세요");
    System.out.println(">>>>>     ");
    String str1=s.nextLine();
    
    for(j=str1.length()-1;j>=0;j--) {
        	System.out.printf("%c",str1.charAt(j));
    }
    
	//q3
    System.out.println("================");
    int line = 5;
    System.out.println("트리만들기");
	String tree = "*";
	int line1 = 0;
	for (int i = 0; i < line; i++) {
		for (int q = (line - 1) - i; q > 0; q--) {
			System.out.print(" ");
		}
		System.out.println(tree);
		tree += "**";
	}
	System.out.println("트리 뒤집기");

	String blank = "";
	for(int i = 0 ; i < line; i++) {
		String star = "*";
		for(int q = 0 ; q < (line-1)-i ; q++) {
			star += "**";
		}
		System.out.println(blank + star);
		blank += " ";
	}
	}
}
