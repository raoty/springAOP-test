package org.springAop.aspectj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void testApp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) context.getBean("opBean");  
        System.out.println("==========开始调用msg方法================");  
        e.msg();  
        System.out.println("==========开始调用m方法================");  
        System.out.println(e.m());
        System.out.println("==========开始调用k方法================");  
        System.out.println(e.k());
        System.out.println("==========开始调用t方法================");
        try {
			e.t();
		} catch (Exception e1) {
			System.out.println("=========出现了异常============");
			e1.printStackTrace();
		}
	}
}
