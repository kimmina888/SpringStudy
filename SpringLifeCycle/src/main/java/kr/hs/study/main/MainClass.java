package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		/* xml파일을 읽어서 로딩을 해라*/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");	
		
		//t1을 가지고 와서 obj1에 대입 후 주소 출력 TestBean1
//		 TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
//		 TestBean1 obj2=ctx.getBean("t1",TestBean1.class);
//		  
//		  System.out.println("obj1:"+obj1); 
//		  System.out.println("obj2:"+obj2);
//		  
//		  TestBean1 obj3=ctx.getBean("t2",TestBean1.class);
//		  System.out.println("obj3:"+obj3);
//		  TestBean1 obj4=ctx.getBean("t2",TestBean1.class);
//		  System.out.println("obj4:"+obj4);
//		  
		  TestBean1 obj5=ctx.getBean("t3",TestBean1.class);
		  System.out.println("obj5:"+obj5);
	
		ctx.close();
	}

}
