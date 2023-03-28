package forEx;

public class Ex04_05 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
		System.out.println("==========");
		for (int i = 1; i < 5; i++) {
			// *을 출력
			// j <= i
			//========
			// 1 <= 1
			// 2 <= 1
			//========
			// 1 <= 2
			// 2 <= 2
			// 3 <= 2 (조건불일치로 반복문 탈출)
			for (int j = 1; j<=i ; j++) {
			System.out.print("*");
		}
			// 줄바꿈
			System.out.println();
				
			}
		System.out.println("==============");
		}

	}


