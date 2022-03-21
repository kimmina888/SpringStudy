package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloKr;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloEn en = ctx.getBean("helloen",HelloEn.class);
		HelloKr kr = ctx.getBean("hellokr",HelloKr.class);
		en.SayHello();
		kr.SayHello();
	}

}
