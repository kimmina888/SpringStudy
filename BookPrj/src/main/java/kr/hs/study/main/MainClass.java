package kr.hs.study.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Novel;


public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");	
		
		Book obj1=ctx.getBean("t1",Novel.class);
		obj1.buy();
		
		ctx.close();
	}

}
