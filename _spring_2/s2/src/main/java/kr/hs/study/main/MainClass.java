package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.println(t1.get_a());
		System.out.println(t1.get_b());
		System.out.println(t1.get_c());
		System.out.println(t1.get_d());
		System.out.println(t1.get_e());
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.println(t2.getData1());
		System.out.println(t2.getData2());
		System.out.println(t2.getData3());
		System.out.println(t2.getData4());
		ctx.close();
	}

}
