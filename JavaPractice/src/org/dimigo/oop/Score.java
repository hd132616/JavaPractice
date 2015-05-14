package org.dimigo.oop;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		System.out.println("국어 점수 입력 => ");
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		int tot = kor + mat + eng;
		float avg = tot/3;
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n");
		sb.append("국어 점수 :").append(kor+"\n");
		sb.append("수학 점수 :").append(mat+"\n");
		sb.append("영어 점수 :").append(eng+"\n");
		sb.append("총점 : ").append(tot+"\n");
		sb.append("평균 : ").append(String.format("%.1f", avg)+"\n");

		System.out.println(sb.toString());

	}

}
