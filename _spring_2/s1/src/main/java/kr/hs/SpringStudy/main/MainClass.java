package kr.hs.SpringStudy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.SpringStudy.beans.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/SpringStudy/config/cpmfig.xml");
		
		Person obj1 = ctx.getBean("p1",Person.class);
		System.out.println("obj1 : "+obj1);
		ctx.close();
	}

}
