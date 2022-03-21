package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext x = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean d = x.getBean("t1",TestBean.class);
		d.showData();
		
		System.out.println("=================================================");
		TestBean d2 = x.getBean("t2",TestBean.class);
		d2.showData();
		
		System.out.println("=================================================");
		TestBean d3 = x.getBean("t3",TestBean.class);
		d3.showData();
		
		System.out.println("=================================================");
		TestBean d4 = x.getBean("t4",TestBean.class); 
		d4.showData();
		  
		System.out.println("=================================================");
		TestBean d5 = x.getBean("t5",TestBean.class); 
		d5.showData();
		
		System.out.println("=================================================");
		TestBean2 t1 = x.getBean("t6",TestBean2.class);
		t1.ShowData();
		
		System.out.println("=================================================");
		TestBean2 t2 = x.getBean("t7",TestBean2.class);
		t1.ShowData();
	}

	
}
