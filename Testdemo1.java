package com.javaintro;

public class Testdemo1 {

	public void show() {
		System.out.println("Instance Method1");
		show1();
	}
	public void show1() {
		System.out.println("Instance Method2");
		display();
	}
	
	static void display() {
		System.out.println("Static Method1");
		display1();
	}
	
	static void display1() {
		System.out.println("Static Method1");
	}
	
	public static void main(String[] args) {
	
	}
	static {
		Testdemo1 t = new Testdemo1();
		t.show();
	}
}
