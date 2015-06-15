package org.dimigo.oop;

public class PiggyBankTest {
	public static void main(String[] args) {
		PiggyBank piggy = new PiggyBank();
		FamilyMember dad = new FamilyMember("아빠");
		FamilyMember mom = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember bro = new FamilyMember("남동생");

		FamilyMember.printMemberCnt();
		
		piggy.putMoney(dad, 10000);
		piggy.putMoney(mom, 5000);
		piggy.putMoney(me, 2000);
		piggy.putMoney(bro, 1000);
		
		piggy.printBalance();
		piggy.putMoney(me, 1000);
		piggy.printBalance();
	}
}
