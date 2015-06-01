package api.util.hashMap;

public interface MemberService {
	
	public void join(String id, String password, String name, int age, String addr);
	
	public void login(String id, String password);
	// 출력은 예시
	// 입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요.
	// 비번이 다릅니다.다시 입력하세요.
	// 환영 합니다. 서울시에 사는 20게 홍길동님...
}
	