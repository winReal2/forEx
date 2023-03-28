package forEx;

import java.util.Scanner;

public class Ex04_07_02 {

	public static void main(String[] args) {
		
		int money = 0;
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("=============================");
		System.out.println("선택 > ");
		
		int input = scan.nextInt();
		switch (input) {
			case 1 : 
				money = scan.nextInt();
				System.out.println("예금액 >" + money);
			 break;
			case 2 : 
				int num = scan.nextInt();
				if(money>num) {
					System.out.println("출금액 > " + money);
				} else {
					System.out.println("출금액 부족 > " + money);
				}
				money = scan.nextInt();
				System.out.println("출금액 > " + money);
			break;
			case 3 : 
				money += scan.nextInt();
				System.out.println("잔고 > " + money);
			break;
			case 4 : 
				System.out.println("프로그램 종료");
			break;
		
			}	
		}		
		
	}
}
