package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean1 {
	
	@Autowired
	private DataBean1 data1;
	
	@Autowired
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	//@Autowried, Qualifer("test")����ؼ�
	//��ü ����� 
	//data1, data2 �� ���
	

}
