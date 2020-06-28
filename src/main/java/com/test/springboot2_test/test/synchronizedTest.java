package com.test.springboot2_test.test;

public class synchronizedTest implements Runnable {

	static int a = 0;

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			increase();
//			method1();
//			method2();
		}
	}

	public synchronized void increase() {
		a++;
	}

	public synchronized void method1() {
		System.out.println("这是method1。。。。。");
	}

	public synchronized void method2() {
		System.out.println("这是method2。。。。。");
	}

	public static void main(String[] args) throws InterruptedException {
		synchronizedTest s = new synchronizedTest();

		Thread thread1 = new Thread(s);
		Thread thread2 = new Thread(s);



		thread2.start();
		thread2.join();
		System.out.println("t2");

		thread1.start();
		thread1.join();
		System.out.println("t1");


		System.out.println(a);
	}
}
