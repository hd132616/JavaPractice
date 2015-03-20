package org.dimigo.basic;

public class ShortCircuit {
	public static void main(String[] args){
		boolean flag = true;
		int a = 10;
		//OR 연산은 true가 될 가능성이 높은 것을 먼저 작성
		if(flag || (a/0 == 0)){
			System.out.println("OR 연산");
		}
		//AND 연산은 false가 될 가능성이 높은 것을 먼저 작성
		
	}
}
