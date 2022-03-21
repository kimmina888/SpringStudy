package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//config.xml������ �޸𸮷� �ε��Ͽ� ��ü�� ������ �� container�� ������.
		TestBean t1= (TestBean)ctx.getBean("t1");
		System.out.println("T1 : " +t1);
		//container�� �ִ� t1 ���� ������ �ͼ� t1�� ����
		TestBean t2= ctx.getBean("t2", TestBean.class);
		System.out.println("T2 : " +t2);
		TestBean t3= ctx.getBean("t2", TestBean.class);
		System.out.println("T3 : " + t3);
		ctx.close();
		//�����̳� ���� 
	}

}
