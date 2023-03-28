package forEx;

public class Ex04_03 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던져서 나온 수
		// 1 ~ 6까지 6개의 수가 나올 수 있다
		// 0.000...1 <= Math.random( ) < 1 (0.999...9)
		// 0.000...6 <=   0,1,2,3,4,5  < 5.4...      (*6을 했을때)
		// 1.000...6 <=   1,2,3,4,5,6  < 6.4...     (+1을 해서 초기값을 지정)
		// 0보다 크거나 같고 5보다 작은 값을 추출
		//초기값 지정 (+) + 1 
		while (true) {
		int i = (int)(Math.random()*6+1);
		int j = (int)(Math.random()*6+1);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		// i, j의 합이 5이면 (i,j) 출력 후 종료
		// 아니면 계속 주사위를 굴립니다.
		if(i+j==5) {
			System.out.printf("(%d,%d)",i,j);
			break;
		}
//		while(i+j==5) {
//			System.out.println("("+i+","+j+")");
//			break;
		}
		 

	}

}
