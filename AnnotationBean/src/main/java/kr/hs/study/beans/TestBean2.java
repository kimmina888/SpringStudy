package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	
	@Autowired //container�� DataBean1Ÿ���� bean�� ������ �� ���� �˾Ƽ� data1�� �ڵ������ض�
	@Qualifier("d1")
	//�̸��� d1�� bean�� ã�Ƽ� data1�� �ڵ������ض�
	private DataBean1 data1;
	
	
	@Qualifier("d2")
	@Autowired
	private DataBean2 data2;
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	
}
