package kr.hr_study2;

import kr.hr_study.Hello;
import kr.hr_study.HelloWorldEn;
import kr.hr_study.HelloWorldKo;

public class Main {

	public static void main(String[] args) {
		Hello helloko = new HelloWorldKo(); // ������ �θ��� ������ �ڽ��� ����Ű�� ���� 
		say_METHOD(helloko);
		//spring������ ������ ����
	}
	public static void  say_METHOD(Hello helloko) {
		helloko.SayHello();
	}

}

