package com.test.springboot2_test.test;

public class as {
	public static void main(String[] args) {
		A ab = new B();
		ab = new B();
	}
}


class B extends A {
	static {
		System.out.println("a");
	}

	public B() {
		System.out.println("b");
	}
}

class A {
	static {
		System.out.println("1");
	}

	public A() {
		System.out.println("2");
	}
}