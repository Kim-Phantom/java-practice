package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// q1
		int lotto[] = new int[6];
		System.out.println("로또 번호: ");
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
		Arrays.sort(lotto);
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		
		
		//q1.1
		ArrayList<Integer> returnArr = null;
		returnArr = weekLotto();
		System.out.println(returnArr);

		// q2
        ArrayList<Integer> weekLotto = null;
        String [] numArr = {"1", "10"};
      
        weekLotto = weekLotto(numArr);
        System.out.println(weekLotto);
//		
//		for(int i = 0; i < 100; i++) {
//			int n = (int)(Math.random()*10);
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//	    int [] weekLotto2 = new int [6];
//		 System.out.println("로또 번호: ");
//			for(int i1 = 0; i1 < weekLotto.length; i1++) {
//				int num = (int)(Math.random()*45)+1;
//				weekLotto[i1] = num;
//				for(int j1 = 0; j1 < i1; j1++) {
//					if(weekLotto[i1] == weekLotto[j1]) {
//						i1--;
//						break;
//					}
//				}
//			}
//			Arrays.sort(weekLotto);
//		    for(int i1 :weekLotto) {
//		    	System.out.print(i + " ");
//	    
//	   }

//	}
	}
	public static ArrayList<Integer> weekLotto(){
		  ArrayList<Integer> arr =new ArrayList<Integer>();
		  Boolean flag = false;
		  while(arr.size() < 6) {
			  int num = (int) (Math.random() * 45) + 1;
			  for(int i = 0 ; i< arr.size(); i++) {
				  if(num == arr.get(i)) {
					  flag = true;
				  }
			  }
			  if(!flag) {
				  arr.add(num);
			  }
		  }
		  return arr;
	}
	public static ArrayList<Integer> weekLotto(String [] strArr){
		  
		  ArrayList<Integer> arr =new ArrayList<Integer>();
		  for(int i = 0; i < strArr.length; i ++) {
			  arr.add(Integer.parseInt(strArr[i]));
		  }
		  System.out.println(arr);
		  
		  Boolean flag = false;
		  while(arr.size() < 6) {
			  int num = (int) (Math.random() * 45) + 1;
			  for(int i = 0 ; i< arr.size(); i++) {
				  if(num == arr.get(i)) {
					  flag = true;
				  }
			  }
			  if(!flag) {
				  arr.add(num);
			  }
		  }
		  return arr;
	}
	
}
