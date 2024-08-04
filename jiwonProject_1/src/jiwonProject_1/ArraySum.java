package jiwonProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySum {

	public static void main(String[] args) throws IOException {
		
		//합배열 구하기
		//A[0]부터 A[i] 까지 합 S[i]
		//S[i] = S[i-1] + A[i]
		// i에서 j까지 구간 합. S[j] - S[i-1]
		/*
		 * idx 0   1  2 3 4 5 
		 * A   15 13 10 7 3 12
		 * if) 3~5까지 구하고 싶으면,, A[5] - A[2]  
		 */
		/*
		 * 예제 입력
		 * 5 3 
		 * 5 4 3 2 1
		 * 1 3
		 * 2 4
		 * 5 5
		 * 결과
		 * 12
		 * 9
		 * 1
		 */
		/*
		 * BufferedReader : 입력 스트림에서 문자를 읽는 함수.
		 *                  문자나 배열, 라인들을 효율적으로 읽기 위해 문자들을 버퍼에 저장하고 읽는 방법.
		 *                  버퍼의 사이즈는 사용자가 지정할 수 있으며 지정하지 않으면 default사이즈가 적용됨.
		 * - Buffer : 임시메모리영역
		 * - Buffer flush : 버퍼에 남아있는 데이터를 출력시킨다. = 버퍼 비우기
		 * - BufferReader : 버퍼를 이용한 입력/ BufferWriter : 버퍼를 이용한 출력
		 * 함수 : readLine() -> 데이터 라인 단위로 읽기 가능. enter 만으로 경계 인식.
		 
		 *	StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
			int a = Integer.parseInt(st.nextToken()); //첫번째 호출
			int b = Integer.parseInt(st.nextToken()); //두번째 호출

			String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
		 *
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//한줄 읽고
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int count2 = Integer.parseInt(st.nextToken());
		
		//또 한줄 읽고 배열에 넣는데,,넣을때 합을 넣고 있음. 
		//A[1] = A[0]+처음꺼
		//A[2] = A[1]+지금꺼.
		//A[3] = A[2]+지금꺼.
		st = new StringTokenizer(br.readLine());
		long[] Ar = new long[num+1];
		for(int i =1; i <=num; i++) {
			Ar[i] = Ar[i-1]+Integer.parseInt(st.nextToken());
		}
		
		// 1 3 이면 A[3]까지 더한 값 - A[0]까지 더한 값.
		for(int q = 0;  q<count2; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(Ar[j] - Ar[i-1]);
		}
		
	}

}
