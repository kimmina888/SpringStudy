package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//config.xml파일을 메모리로 로딩하여 객체를 생성한 후 container에 보낸다.
		TestBean t1= (TestBean)ctx.getBean("t1");
		System.out.println("T1 : " +t1);
		//container에 있는 t1 빈을 가지고 와서 t1에 넣음
		TestBean t2= ctx.getBean("t2", TestBean.class);
		System.out.println("T2 : " +t2);
		TestBean t3= ctx.getBean("t2", TestBean.class);
		System.out.println("T3 : " + t3);
		ctx.close();
		//컨테이너 종류 
	}

}
