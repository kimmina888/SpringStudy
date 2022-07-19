package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.DataBean;

@Repository
public class daoInterfaceImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate session;
	
	public void insert(DataBean bean) {
		session.insert("test.insert_data", bean);

	}

	public List<DataBean> select() {
		// TODO Auto-generated method stub
		return session.selectList("test.select_data");
	}

	public void update(DataBean bean) {
		// TODO Auto-generated method stub
		session.update("test.update_data",bean);
	}

	public void delete(DataBean bean) {
		// TODO Auto-generated method stub
		session.delete("test.delete_data",bean);
	}

}
