package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");	
		/* t1객체를 가지고 와서 data1, data2, data3값을 출력 */
		
		 TestBean obj1=ctx.getBean("t1",TestBean.class);
		 obj1.dataPrn();
		 System.out.println("=============================");
		 
		 TestBean obj2=ctx.getBean("t2",TestBean.class);
		 obj2.dataPrn();
		 
		 System.out.println("=============================");
		 
		 TestBean obj3=ctx.getBean("t3",TestBean.class);
		 obj3.dataPrn();
		 
		 System.out.println("=============================");
		 
		 TestBean obj4=ctx.getBean("t4",TestBean.class);
		 obj4.dataPrn();
		 
		 System.out.println("=============================");
		 
		 TestBean obj5=ctx.getBean("t5",TestBean.class);
		 obj5.dataPrn();
		 System.out.println("=============================");
		 
		 TestBean2 obj6=ctx.getBean("t6",TestBean2.class);
		 obj6.dataPrn();
		 
		 TestBean2 obj7=ctx.getBean("t7",TestBean2.class);
		 obj7.dataPrn();
		ctx.close();
	}

}
