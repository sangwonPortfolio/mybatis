package member.model.dao;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;

public class MemberDao {

	public Member selectMember(SqlSession session, Member m) {
		Member member = null;
		// 기존이였으면 PreparedStatement를 사용해서 작성했었다.
		// SqlSession에서 제공하는 메소드를 통해서 sql문을 작성하자.
		
		// 객체 한 개를 조회할때는 SqlSession의 selectOne()메소드를 사용한다.
		// 메소드의 전달인자는 2개의 값을 넘기게 되는데
		// 첫번째 인자는 쿼리문이 존재하는데 '매퍼의 네임스페이스.뤄리문 아이디'
		// 두번째 인자는 쿼리문을 완성시킬 '객체'이다.
		
		member = session.selectOne("memberMapper.loginMember",m);
		
		System.out.println(member);
				
		
		return member;
	}

}
