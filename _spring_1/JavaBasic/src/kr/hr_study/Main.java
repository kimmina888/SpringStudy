package kr.hr_study;

public class Main {
	public static void main(String[] args) {
		Hello hello = new HelloWorldEn();
		say_METHOD(hello);
	}
	public static void  say_METHOD(Hello hel) {
		hel.SayHello();
	}
}
