package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		System.out.println("가장 좋아하는 가수는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		String singer = "성시경";
		if(answer.equals(singer))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다!");
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		String actor = "송중기";
		if(answer.equals(actor))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다!");
		
		System.out.println("가장 좋아하는 동물은?");
		answer = scanner.nextLine();
		String animal = "고양이";
		if(answer.equals(animal))
			System.out.println("정답입니다!");
		else
			System.out.println("틀렸습니다!");
		scanner.close();
	}

}
