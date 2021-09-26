package Pack;

import org.apache.ibatis.session.SqlSession;

interface Delegate {
	int delegate(SqlSession session);
}
