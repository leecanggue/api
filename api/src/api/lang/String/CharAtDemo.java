package api.lang.String;

public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "800101-1555555";
		/*
		 * index 는 0부터 시작하므로
		 * 남녀를 구별하는 1값은 7번째 인덱스에 위치한다.
		 */
		// char isMan = ssn.charAt(7);
		/*
		 * indexOf() 는 파라미터로 주어진 String 값의
		 * 위치 값을 리턴한다. "-"의 다음값이 남녀를
		 * 구분하는 값이므로 +1 을 주었다.
		 */
		char isMan = ssn.charAt(ssn.indexOf("-") + 1);
		switch(isMan){
		case '1' : case '3' : System.out.println("남성"); break;
		case '2' : case '4' : System.out.println("여성"); break;
		default : System.out.println("잘못된 입력값입니다."); break;
		}
	}
}
