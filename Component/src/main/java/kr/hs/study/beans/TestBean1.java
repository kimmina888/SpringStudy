package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component  //�̸��� ����.. <bean class="kr.hs.study.beans.TestBean1"/>
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1 �� �⺻������");
	}

}
