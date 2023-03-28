package forEx;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		//입력을 받기 위해 스캐너 객체를 생성합니다.
		Scanner scan = new Scanner(System.in);
		int money = 0;
		outter:
		while(true) {
			
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			System.out.println("선택>");
			
			//scan.next()// 사용자의 입력을 문자열로 반환
			//if문, switch문 사용가능
			int input = scan.nextInt();  //사용자의 입력을 숫자로 반환
			switch(input) {
			case 1 : 
				System.out.println("예금엑> " + money);
				money += scan.nextInt();
				System.out.println("사용자 입력값 : "+ money);
				// 변수의 값이 1이면 실행
				// break문이 없으면 다음 case를 계속 실행
				break;
			case 2 :
				System.out.println("출금액> " + money);
				System.out.println("==출금 :" + money);
				int num = scan.nextInt();
				if(money<num) {
					System.out.println("금액부족");
				} else {
					money-=num; //money= money-num
				}
				break;
			case 3 :
				System.out.println("잔고> " + money);
				money += scan.nextInt();
				System.out.println("사용자 입력값 : "+ money);
				break;
			case 4 :
				// System.exit(0);
				// 반복문을 탈출
				break outter;
			}
		}
		//System.out.println("프로그램 종료");
		
		}
		
	}


