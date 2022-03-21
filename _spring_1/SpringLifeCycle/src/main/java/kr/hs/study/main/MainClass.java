package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext x = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		GenericXmlApplicationContext x = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj1 = x.getBean("p1",TestBean1.class); 
		System.out.println(obj1);
		
		TestBean1 obj2 = x.getBean("p1",TestBean1.class); 
		System.out.println(obj2);
		
		TestBean2 obj3 = x.getBean("p2",TestBean2.class);
		System.out.println(obj3);
		
		TestBean2 obj4 = x.getBean("p2",TestBean2.class);
		System.out.println(obj4);
		
		TestBean1 obj5 = x.getBean("p3",TestBean1.class);
		System.out.println(obj5);
		
		x.close();
	}

}
