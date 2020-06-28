package com.test.springboot2_test.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		LockTest lockTest = new LockTest();

		for (int i = 0; i < 2; i++) {
		}

	}

}
