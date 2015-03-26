package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		System.out.println("<<고속도로 통행료 계산>>");
		int dis = 25, fee=0;
		String car = "고속버스";
		
		switch (car){
		case "고속버스" : 
			if( dis <= 10 )
				fee=850;
			else{
				if(dis%10==0)
					fee = (dis/10-1)*300 + 850;
				else
					fee = (dis/10)*300 + 850;
			}
			break;
		case "경차" :
			if( dis <= 10 )
				fee = 300;
			else{
				if(dis%10==0)
					fee = (dis/10-1)*200 + 600;
				else
					fee = (dis/10)*200 + 600;
			}
			break;
		case "그외" :
			if( dis<=10 )
				fee = 600;
			else{
				if(dis%10==0)
					fee = (dis/10-1)*200 + 600;
				else
					fee = (dis/10)*200 + 600;
			}
			break;
		default : System.out.println("차종을 정확히 입력해주세요");
		}
		System.out.println("거리: " + dis + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + fee);
		
	}
}
