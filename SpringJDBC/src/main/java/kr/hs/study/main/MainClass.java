package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.BeanConfigClass;
import kr.hs.study.beans.TestBean;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//TestDAO 가지고 오기
		TestDAO dao=ctx.getBean(TestDAO.class);
		
		//TestBean 객체 bean1 만들어서 100,spring100 넣기
//		TestBean bean1=new TestBean();
//		bean1.setData1(100);
//		bean1.setData2("spring100");
//		
		//TestBean 객체 bean2 만들어서 200, spring200넣기
//		TestBean bean2=new TestBean();
//		bean2.setData1(200);
//		bean2.setData2("spring200");
//		
		//insert_data호출
		
		//dao.insert_data(bean1);
		//dao.insert_data(bean2);
		
		
		//update
//		TestBean bean3=new TestBean();
//		bean3.setData1(100);
//		bean3.setData2("testtest");
//		
//		dao.update_data(bean3);
//		System.out.println("UPdated!!!!!!!");
		
		List<TestBean> list=dao.select_data();
		for(TestBean bean:list) {
			System.out.println("data1:"+bean.getData1());
			System.out.println("data2:"+bean.getData2());
		}
		ctx.close();

	}

}
