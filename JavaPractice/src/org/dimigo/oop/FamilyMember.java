package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	FamilyMember(String memberName){
		this.memberName = memberName;
		++memberCnt;
	}
	String getMemberName(){
		return this.memberName;
	}
	static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : " + memberCnt +"명");
	}
}
