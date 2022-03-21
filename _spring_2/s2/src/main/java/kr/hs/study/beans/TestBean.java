package kr.hs.study.beans;

public class TestBean {
	private int a;
	private double b;
	private String c;
	private DataBean d;
	private DataBean e;
	
	public TestBean(int a, double b, String c, DataBean d, DataBean e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	public int get_a() {
		return this.a;
	}
	public double get_b() {
		return this.b;
	}
	public String get_c() {
		return this.c;
	}
	public DataBean get_d() {
		return this.d;
	}
	public DataBean get_e() {
		return this.e;
	}
}
