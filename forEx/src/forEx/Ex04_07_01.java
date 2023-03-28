package forEx;

import java.util.Scanner;

public class Ex04_07_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int money = 0;
		outter:
			while(true) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			System.out.println("선택>");
			
			int input = scan.nextInt();  
			switch(input) {
				case 1 : 
					System.out.println("예금액 ? ");
					money += Integer.parseInt(scan.next());
					System.out.println("현재잔고는 :" + money + "입니다.");
					// 반복문, switch문을 빠져나갑니다.
					break;
				case 2 :
					System.out.print("출금액 > ");
					int num = scan.nextInt();
					if(money < num) {
						System.out.println("잔액부족");
					}else {
						
					} break;
				
				case 3 :
					System.out.println("잔고 >" + money);
					
				
				case 4 :
				System.exit(0);
					break outter;
				default:
					break;
			}
		}   
		//자원을 반납!
		scan.close();
		System.out.println("프로그램이 종료 되었습니다.");
		}
		
	}
