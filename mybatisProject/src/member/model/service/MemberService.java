package member.model.service;

import member.model.vo.Member;

public interface MemberService {

	// 인터페이스는 묵시적으로 public abstract이다.
	
	// 로그인 처리용 메소드
	// public abstract 생략가능
	public abstract Member selectMember(Member m);
	
	
}
