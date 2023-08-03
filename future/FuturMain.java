package future;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FuturMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Futurestudent> stuList = new ArrayList<>();
       stuList.add(new  Futurestudent("김규영","Kim GyuYeong"));
       stuList.add(new  Futurestudent("김동현","Kim DongHyun"));
       stuList.add(new  Futurestudent("김상준","Kim SangJun"));
       stuList.add(new  Futurestudent("김성운","Kim SungUn"));
       stuList.add(new  Futurestudent("김세준","Kim SeJun"));
       stuList.add(new  Futurestudent("노윤기","Noh YoonGi"));
       stuList.add(new  Futurestudent("박근혜","Park GeunHye"));
       stuList.add(new  Futurestudent("사원기","Sa WeonGi "));
       stuList.add(new  Futurestudent("송현지","Song HyunJi"));
       stuList.add(new  Futurestudent("신가희","Shin GaHee"));
       stuList.add(new  Futurestudent("예준서","Ye JunSeo"));
       stuList.add(new  Futurestudent("윤가영","Yoon GaYoung"));
       stuList.add(new  Futurestudent("윤서준","Yun SeoJun"));
       stuList.add(new  Futurestudent("이규환","Lee GyuHwan"));
       stuList.add(new  Futurestudent("이상희","Lee SangHee"));
       stuList.add(new  Futurestudent("이영규","Lee YoungGyu"));
       stuList.add(new  Futurestudent("이재우","Lee JaeWoo"));
       stuList.add(new  Futurestudent("이호제","Lee HoJe"));
       stuList.add(new  Futurestudent("임지윤","Lim JiYoon"));
       stuList.add(new  Futurestudent("정민형","Jeong MinHyoung"));
       stuList.add(new  Futurestudent("조하은","Jo HaEun"));
       stuList.add(new  Futurestudent("최민혁","Choi MinHyeock"));
       stuList.add(new  Futurestudent("최성웅","Choi SungWoong"));
        //11일이 지났습니다
       System.out.println("======미래융합교육원 교육 시작========");
       for(int i=0; i < 11; i++) {
    	   System.out.println((i + 1) + "일차===========");
    	   for(Futurestudent stu: stuList) {
    		   stu.endDay();
    	   }
    	   try {
    		   Thread.sleep(1000);
    	   }catch (InterruptedException e) {
    		   e.printStackTrace();
    	   }
       }
       Collections.sort(stuList, (stuA, stuB)->  stuB.getLevel() - stuA.getLevel());
       for(int i = 0; i <stuList.size();i++) {
    	   System.out.println((i + 1) + "등" + stuList.get(i));
       }
       System.out.println(Futurestudent.getCnt());
	}

}
