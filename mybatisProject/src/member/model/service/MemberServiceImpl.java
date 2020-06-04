package member.model.service;

import static common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberServiceImpl implements MemberService{

	@Override
	public Member selectMember(Member m) {
		// Connection 객체를 우선 생성해야 되는데
		// 마이바티스에서는 Connection 대신에 SqlSeesion이라는 객체를 생성한다.
		
		// JDBCTemplate을 통해서 Connection을 생성했듯이
		// common 패키지 안에 Template 클래스를 만들어서 쓰자
		
		SqlSession session = getSqlSession();
		
		// Connection 객체와 넘겨받은 값을 Dao로 넘겨줬듯이
		// SqlSession 객체와 넘겨받은 값을 Dao로 넘겨주자.
		Member member = new MemberDao().selectMember(session, m);
		return member;
	}

}
