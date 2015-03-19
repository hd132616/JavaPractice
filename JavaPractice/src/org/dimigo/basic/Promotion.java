package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args){
		System.out.println("<<디미베네 연간 인건비>>");
		int sal=1700000; int emp = 3; int sto = 1500;
		System.out.printf("월 평균 급여 : %,d원\n",sal);
		System.out.println("점포 내 직원수 : " + emp);
		System.out.printf("점포 수 : %,d개\n\n", sto );
		long year = (long)sal*emp*sto*12;
		
		System.out.printf("연간 인건비 : %,d\n",year);
	}
}
