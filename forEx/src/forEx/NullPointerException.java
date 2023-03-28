package forEx;

public class NullPointerException {

	public static void main(String[] args) {
		// 초기값으로 null을 입력
		// 참조변수가 아무런 객체도 참조하고 있지 않다는 의미
		// . : 주소 접근자, 객체 접근 연산자
		// .이후 객체가 갖고 있는 접근 가능한 필드, 메서드 목록을 보여준다
		// 필드,메소드에 접근하기 위해서는 주소접근자 필요
		// 변수이름. 필드면;
		// 변수이름. 메서드면(매개변수);
		
		//NullPointerException 해결방안: null값이 아니도록 초기화 시켜주거나
		//참조변수가 null인경우 실행되지 않도록 처리한다.
		String name = null;
		name = "안녕";
		//String 객체는 다양한 메서드를 가지고 있음
		//length() : 문자열의 총 길이를 반환
		if(name != null) {
		System.out.println("총 문자수 : " + name.length());
		
		}
		System.out.println("정상적으로 종료 되었습니다.");
	}

}
