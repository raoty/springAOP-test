package org.springAop.aspectj.test;

/**
 * Hello world!
 *
 */
public class Operation {
	
	public void msg() {
		System.out.println("msg method invoked");
	}

	public int m() {
		System.out.println("m method invoked");
		return 2;
	}

	public int k() {
		System.out.println("k method invoked");
		return 3;
	}
	
	public void t() throws Exception {
		throw new Exception("doing throw exception");
	}
}
