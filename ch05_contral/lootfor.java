package ch05_contral;

import java.util.Scanner;

public class lootfor {

	public static void main(String[] args) throws InterruptedException {
		//콘솔창에 1~10까지 출력하세요
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		int num =1;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
        System.out.println("===================for==============");
        //for문
        
        for(int i=1 ; i <=10; i++) {
        	System.out.println(i);
        }
        //System.out.println(i); for문안에서 선언된 i는 for문에서만 사용가능
        	
        //for문 밖에서 쓰고 싶다면
        int one =1;
        for(int i=1; i <=10 ; i++) {
        	System.out.println(one++);
        }
        System.out.println(one);
        for(int j=1; j <=10; j++) {
        	System.out.println(j);
        }
	    //1~20까지 더하기
        int sum = 0;
        //for문을 작성해주세요 i를 대입 연산자를 사용해서 더하면 편함
  	    for(int i=1 ; i <=20; i++) {
  	    	System.out.println(i);
  	    	System.out.println(one++);
  	    	sum += i;
  	    	
  	    }
	   System.out.println("1부터 20까지 더하기 :" + sum);
	   
	   //21부터 45까지 더하기
	   int sum2 = 0;
	   for(int i = 21 ; i <=45 ; i++) {
		   System.out.println(one++);
		   sum2 +=i;
	   }
	   System.out.println("21부터 45까지 더하기 :" + sum2);
        //	   1부터 40까지중에 짝수만 더한 값을 출력하시요
	   int sum3 = 0;
	   //for문과 if문을 사용해서 출력
       for(int i = 1; i <= 40; i++) {
    	   if(i % 2 ==0) {
    	 System.out.printf("sum3 + i: %d +%d \n",sum3,i); // 더한값 출력하기 짝수만
    	   sum3 +=i;
       }}
       System.out.println("1부터 40까지 짝수만 :" + sum3);
       
       int sum4 = 0;
       for(int i=0; i<=40; i +=2) {
    	   System.out.println( "i값:" + i);
    	   sum4 +=i;
       }
       System.out.println(sum4);
	
       
       
       
       //for문을 이용해서 2단을 출력해 보세요
       //2*1 =2
       //2*2 =4
       //2*3 =6....
       System.out.println("===========2단============");
       for(int i = 1; i<=9; i++) {
          System.out.println("2 x " + i + "=" + (2*i));
	}
	
       
       
       //입력받은 구구단을 출력하시요 (ex 2 --> 2단 , 5 --> 5단)
       Scanner scanner = new Scanner(System.in);
       System.out.println("몇단을 출력할까요?");
       int gugudan = scanner.nextInt(); 
       for(int i = 1; i<=9; i++) {
       System.out.println(gugudan + "x" +i +"=" + (gugudan*i));
       }
      
       
       
       
       
      
       //위 프린트와 같이 for 문을 이용하여 트리를 출력해 보세요^^
       String star = "";
       for(int a =1 ; a <=5; a++) {
    	   star += "*";
    	   System.out.println(star);
       }
       
       
       //10부터 > 1까지 출력
       for(int i = 10; i >=1; i--) {
    	   System.out.println(i);
    	   
       }
       //국수공장에서  면을 100cm 뽑고 있는데 5cm 마다 잘라줘야 합니다
       for(int i = 0; i < 20; i++) {
    	   System.out.println("|||||||||");
    	   if(i==4 || i == 9 || i == 14) {
    		   System.out.println("--------");   
    	   }
    	//   if (i % 5 == 4) {
    		//   System.out.println("-----------");
    	   }
       //라면 공장에서 면을 30cm 뽑고 있는데
       //6cm 마다 잘라주어야 한다.
       for(int i = 0; i < 30; i++) {
    	   if(i % 2 ==0) {//1 포함 짝수는 /로 표기
    		   System.out.println("////////");
    	   }else if(i % 2==1) {// 홀수는 \ 로 표기
    		   System.out.println("\\\\\\\\\\\\\\\\");// 갯수가 많은 이유 : // 두개가 / 이다
    	   }
    	   //i 가 5일때 ,11 일때, 17일때... 자른다
    	   
    	   //규칙을 찾아서 조건문을 만들어 라면을 잘라 주세요 
    	   Thread.sleep(400); // thread 뒤에서 다룸  400은 400ms 0.4초 멈춤
    	   //if(i==5 || i == 11 || i == 17 || i == 23) {
    		  
    		   if (i % 6 == 5) {
    			   System.out.println("-------------");
       }
          
       }
       //해당 숫자의 각자리의 수를 더한 값을 출력하시요
	      int example = 478941533;
	      int result = 0;
	      String strNum = example + "";
	      for(int i =0; i < strNum.length(); i++) {
	    	  result += Integer.parseInt(strNum.substring(i, i+1)); //0,1 1,2 2,3...
	      }
	      System.out.println("각 자리를 더한 값:" + result);
	      
	      /*
	       * break 문
	       * 반복문 내에서 break 문이 실행되면 해당 반복문을 즉시 종료!!
	       * 1~n 까지 더한 값이 100이상이 되는 지점의 n을 구하시오!
	       */
	      int sum1 = 0;
	      for(int j=1 ; j <9999; j++){
	    	  sum1 += j;
	    	  if(sum1 >= 100) {
	    		  System.out.println(sum1 + "이되는 n:" + j);
	    		  break; // 반복문 멈추기
	    	  }
	      }
	      // 구구단 출력 2 - 9
	      for(int i = 2 ; i <= 9; i ++) {
	    	  if((i == 5) || (i == 8)) {
	    		  continue; // 반복문을 건너뛰기
	    	  }
	      System.out.println(i + "단");
	      for(int j = 1 ; j <=9; j++) {
	    	  System.out.printf("%d x %d = %d \n", i, j, (i * j));
	      }
	      }
	}}


