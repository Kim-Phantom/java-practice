package practice.submit01;

public class result01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//q1	
		
		String name, age, height, phone, email;
		name = "김상준";
		age = "26";
		height = "172cm";
		phone = "01045120642";
		email = "ksj0633@naver.com";
		
		System.out.println("이름:" + name);
		System.out.println("나이:" +  age);
		System.out.println("키:" + height);
		System.out.println("연락처:" + phone);
		System.out.println("이메일:" + email);
				
	//q2
		String enigma = "너오구늘리뭐너먹구지리";
		String enigma1 = enigma.replace("너","");
		String enigma2 = enigma1.replace("구","");
		String enigma3 = enigma2.replace("리","");
	    System.out.println(enigma3);
	    
	    
	//p3
	    
	   int example;
	   example = 278;
	   String str_example = Integer.toString(example);
	   String str_example1 = str_example.substring(0,1);
	   String str_example2 = str_example.substring(1,2);
	   String str_example3 = str_example.substring(2,3);
	   int int_example1 = Integer.parseInt(str_example1);
	   int int_example2 = Integer.parseInt(str_example2);
	   int int_example3 = Integer.parseInt(str_example3);
	   
	   int example_int = int_example1+int_example2+int_example3;
	   System.out.println("결과는 :" + example_int);
	   
	   
	   
	}

}
