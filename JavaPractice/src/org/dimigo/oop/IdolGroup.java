package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup={"빅뱅", "2NE1", "걸스데이"};
		String[][] members ={
				{"GD", "태양","TOP", "대성", "승리"},
				{"CL","산다라박","박봄","공민지"},
				{"혜리","유라","소진","민아"}
		};
		for(int i=0; i<idolGroup.length; ++i){
			System.out.println("<< "+idolGroup[i] + " 멤버 >>");
			for(int j=0; j< members[i].length; ++j){
				System.out.println(members[i][j]);
			}
		}
	}

}
