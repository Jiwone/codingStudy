package jiwonProject_1;

import java.util.Scanner;

public class Sum_1 {

	public static void main(String[] args) {
		/*
		 * 연속된 자연수의 합 구하기.
		 * 자연수 N은 몇개의 연속된 자연수의 합으로 나타낼 수 있다.
		 * ex : N = 15 --> 15 , 7+8,4+5+6,1+2+3+4+5 ==> 4가지
		 */
		int count =1 ; //N 을 뽑는 경우.
		int start_index = 1;
		int end_index =1;
		int sum=1;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(end_index != N) {
			if(sum == N) {
				count++;
				end_index++;
				sum = sum +end_index;
			}
			else if(sum > N) {
				sum = sum -start_index;
				start_index ++;
			}else {
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count);
	}

}
