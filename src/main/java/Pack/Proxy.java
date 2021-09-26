package Pack;

import org.apache.ibatis.session.SqlSession;

public class Proxy {
	static void m1(personDao dao, Delegate delegate) {
		SqlSession session = dao.ssf.openSession();
		try {
			if(delegate.delegate(session) > 0) session.commit();
		}catch (Exception e) { e.printStackTrace(); 
		}finally {session.close();}
	}
}
