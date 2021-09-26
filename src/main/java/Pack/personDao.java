package Pack;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class personDao {
	SqlSessionFactory ssf = null;
	
	personDao(){
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {e.printStackTrace();}
	}
	
	void insert(Person person) {
		Proxy.m1(this, (SqlSession session) -> session.insert("insertPerson", person));
	}
	
	List<Person> showPerson(){
		SqlSession session = ssf.openSession();
		List<Person> pList = session.selectList("selectPerson");
		return pList;
	}
}
