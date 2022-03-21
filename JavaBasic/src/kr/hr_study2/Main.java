package kr.hr_study2;

import kr.hr_study.Hello;
import kr.hr_study.HelloWorldEn;
import kr.hr_study.HelloWorldKo;

public class Main {

	public static void main(String[] args) {
		Hello helloko = new HelloWorldKo(); // 다형성 부모의 참조가 자식을 가리키게 만듬 
		say_METHOD(helloko);
		//spring에서의 느슨한 결합
	}
	public static void  say_METHOD(Hello helloko) {
		helloko.SayHello();
	}

}

