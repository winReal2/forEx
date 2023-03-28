package forEx;

public class Gugudan01 {

	public static void main(String[] args) {
		
		// 중첩(이중)반복문으로 구구단 출력하기
		// for (초기식 ; 조건식 ; 증감식) { }
		// i를 1~9까지 출력하기
		
		// dan : 2 ~ 9 
		Outter :  // 반복문 위에 label을 줌
		for(int dan = 2; dan <10; dan++) {
			System.out.println(dan+"단");
			// for문 시작
			// i : 1 ~ 9
			for(int i=9; i>0; i--) {
				// dan == 6 / 만약 6단이면 구구단을 출력하지마
				if(dan == 6) {
					// label의 위치까지 반복을 탈출합니다.
					break Outter;
				}
				// System.out.println("i =" + i);
				// System.out.println(dan + "*" + i + "=" + dan*i);
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
				
			}
			// for문 종료
			//
			System.out.println();
//			// 6단을 출력한 후 반복문을 탈출합니다.
//			if(dan==6) {
//				break;
//			}
		} // for문 종료
		
		// 1~10까지의 수 중에서 짝수의 합을 구해봅시다
		System.out.println("====  짝수의 합 구하기  ====");
		int sum = 0;
		for(int i = 1; i<11; i++) {
			// 홀수이면 증감식으로 넘어갑니다!
			// % = 나머지연산자
			// 2로 나눈 나머지가 1이면 홀수, 0이면 짝수
			if(i%2==1) { // 홀수이면
				continue; // 증감식으로 이동해!
				
			}
			System.out.println("i ="+ i);
			sum += i;  // sum = sum+i
		}
		System.out.println("1~10까지 짝수의 합계 : " + sum);
		
	} // main 코드블럭 종료

}
