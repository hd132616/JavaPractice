package org.dimigo.basic;
import java.util.Scanner;

public class While {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("-----------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격");
			System.out.println("2. 수비");
			System.out.println("3. 종료");
			System.out.print("메뉴 입력  =>");
			
			menu = scanner.nextInt();
			switch(menu){
			case 1:
				System.out.println("공격하라!!");
				break;
			case 2:
				System.out.println("수비하라");
				break;
			case 3:
				System.out.println("게임 종료");
				scanner.close();
				break;
			case 4 :
				System.out.println("없는 메뉴입니다.");
			}
		}while(menu!=3);
	}
}
