package jiwonProject_1;

import java.util.Scanner;

public class addNumber {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String sNum = sc.next();
		//toCharArray : 문자열을 배열로 만들어서 반환.
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		//-'0' 을 하는 이유 : char형을 int형으로 바꾸려면 아스키코드로 변환됨.
		// 1=> 49. '0' 이면 48임. 49-48 =1 .. 
		for(int i=0 ; i<cNum.length; i++) {
			sum +=cNum[i]-'0';
			
		}
		System.out.print(sum);
	}

}
