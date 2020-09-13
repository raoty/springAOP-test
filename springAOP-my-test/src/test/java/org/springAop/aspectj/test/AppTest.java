package org.springAop.aspectj.test;

import java.util.Set;

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
        System.out.println("==========第一次开始调用msg1方法================");  
        Set<String> s1 = e.msg1();
        
        System.out.println("==========第二次开始调用msg1方法================");  
        Set<String> s2 = e.msg1();
        System.out.println("第一次和第二次的对象是否一致：s1 == s1 ? "+(s1 == s2));
        
        System.out.println("==========调用msg2方法================");
        Set<String> s3 = e.msg2();
        System.out.println("第一次和第三次的对象是否一致：s1 == s3 ? "+(s1 == s3));
	}
}
