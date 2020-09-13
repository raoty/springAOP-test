package org.springAop.aspectj.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Operation {
	
	public Set<String> msg1() {
		System.out.println("初始化对象");
		Set<String> res = new HashSet<String>();
		res.add("hello world");
		return res;
	}

	public Set<String> msg2() {
		Set<String> msg = this.msg1();
		if(msg == null || msg.isEmpty()) {
			System.out.println("msg1的缓存为空");
			return msg;
		}
		
		System.out.println("msg1的缓存非空");
		for (String string : msg) {
			System.out.println(string);
		}
		
		return msg;
	}
}
