package common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {

	public static SqlSession getSqlSession()
	{
		// SqlSession 객체를 반환하기 위한 변순 선언
		SqlSession session = null;
		
		// JDBCTemplate떄 getConnection()과 같은 개념의 메소드로 SqlSession을 반환하자
		
		// mybatis-config.xml파일을 만들었는데 이걸 활용하자.
		
		try {
			InputStream stream = Resources.getResourceAsStream("/mybatis-config.xml");
			
			// SqlSession을 만들기 위해서는 SqlSessionFactory에서 openSession이라는 것을 해줘야 한다.
			// SqlSessionFactory는 SqlSessionFactoryBuilder라는 클래스의 build()를 통해서 생성이 된다.
			
			session = new SqlSessionFactoryBuilder().build(stream).openSession(false);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return session;
	}
	
	// commit(), rollback(), close() 안해도됨
	
	// 왜냐면, SqlSession 클래스가 commit, rollback, close함수를 제공
	// 우리가 만들었던 Statement 관련, ResultSet 관련한 close부분은
	// Dao쪽에서 편리하게 sql문을 작성하게 되었기 때문에 사용하지 않아도 된다.
	
	// 다시 MemberServiceImpl로 돌아가자
}
