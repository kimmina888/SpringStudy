package kr.hs.study.beans;

public class TestBean {
	private int data1;
	private double data2;
	private String data3;
	public TestBean(){
		System.out.println("TestBean�� �⺻ ������");
	}
	public void showData() {
		System.out.println("data1 : "+ data1);
		System.out.println("data1 : "+ data2);
		System.out.println("data1 : "+ data3);
	}
	public TestBean(int data1) {
		System.out.println("int �� �Ű� ������ 1�� �ִ� ������");
		this.data1 = data1;
		this.data2 = 11.11;
		this.data3 = "spring";
	}
	public TestBean(double data2) {
		System.out.println("double �� �Ű� ������ 1�� �ִ� ������");
		this.data1 = 20;
		this.data2 = data2;
		this.data3 = "spring";
	}
	public TestBean(String data3) {
		System.out.println("String �� �Ű� ������ 1�� �ִ� ������");
		this.data1 = 20;
		this.data2 = 22.22;
		this.data3 = data3;
	}
	public TestBean(int data1, double data2, String data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
}
