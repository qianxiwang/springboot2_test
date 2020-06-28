package com.test.springboot2_test.test;

import java.util.Calendar;

public class test {

	public static void main(String[] args) {

		String a = "success";
		String b = new String("success");
		String c = "succ" + "ess";

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.intern() == b.intern());

		System.out.println(reverse("hello"));
		System.out.println("==============================");
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		Calendar time = Calendar.getInstance();
		System.out.println(time.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("==============================");
		time.add(Calendar.DATE, -1);
		System.out.println(time.getTime());

	}


	public static String reverse(String a) {
		if (a == null || a.length() <= 1) {
			return a;
		}
		return reverse(a.substring(1)) + a.charAt(0);
	}
}
