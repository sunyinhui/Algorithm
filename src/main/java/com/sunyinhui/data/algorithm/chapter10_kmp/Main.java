package com.sunyinhui.data.algorithm.chapter10_kmp;


import com.sunyinhui.data.algorithm.chapter10_kmp.tools.Asserts;

public class Main {

	public static void main(String[] args) {
		Asserts.test(KMP.indexOf("Hello World", "H") == 0);
		Asserts.test(KMP.indexOf("Hello World", "d") == 10);
		Asserts.test(KMP.indexOf("Hello World", "or") == 7);
		Asserts.test(KMP.indexOf("Hello World", "abc") == -1);
	}

}
