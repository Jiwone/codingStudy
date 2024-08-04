package jiwonProject_1;

import java.util.Scanner;

public class MaxCount {

	public static void main(String[] args) {
		Scanner input2 = new Scanner(System.in);
		
		int cnt = input2.nextInt();
		/*
		 * 3
		 * 40 80 60 
		 * 40 = > 40/80 *100 = a
		 * 80 => 80/80 *100 = b 
		 * 60 => 60/80 * 100 = c
		 * a+b+c /3 
		 */
		//String num = input2.nextLine();
		int [] Num2 = new int[cnt];
		long maxNum = 0;
		
		for(int i = 0 ; i <Num2.length; i++) {
			Num2[i] = input2.nextInt();
		}
		
		long sum =0;
		for(int j =0; j<cnt; j++) {
			
			if(Num2[j] > maxNum) {
				maxNum = Num2[j];
			}
			sum = sum + Num2[j];
			
			
			
		}
		
		System.out.println(sum *100.0/maxNum/cnt);
		

	}

}
