package kr.hs.study.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");	
		
		TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
		System.out.println("data1:"+obj1.getData1());
		System.out.println("data2:"+obj1.getData2());
		System.out.println("data3:"+obj1.getData3());
		System.out.println("-----------------------");
		
		TestBean2 obj2=ctx.getBean("t2",TestBean2.class);
		System.out.println("data3:"+obj2.getData3());
		System.out.println("data4:"+obj2.getData4());
		
		
		ctx.close();
	}

}
