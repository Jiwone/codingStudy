package jiwonProject_1;

import java.util.Scanner;

public class Sum_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int Sum = sc.nextInt();
		int fSum = 0;
		int count =0;
		int[] A = new int[Num];
		int st_index =0;
		int end_index =1;
		
		for(int i=0;i < Num; i++) {
			A[i]=sc.nextInt();
		}
		while(st_index+1 !=Num) {
			fSum = A[st_index]+A[end_index];
			
			if(fSum == Sum) {
				count++;
				st_index++;
				if(end_index <= st_index) {
					end_index++;	
				}
				
			}else if(fSum != Sum) {
				if(end_index == (Num-1)) {
					st_index++;
					end_index =0;
					end_index = st_index +1;
				}else {
					end_index++;
				}
				
				//end_index 가 끝까지 갔음. 그럼 st_index를 증가시켜줘야됨.
			}
		
			
		}
		System.out.println(count);

	}

}
