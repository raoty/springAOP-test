package com.rao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import junit.framework.TestCase;

/**
 * test spring AOP by DTD style
 *
 */
public class ATest extends TestCase{
	
	private BeanFactory  factory;
	
	public ATest() {
		Resource r=new ClassPathResource("applicationContext.xml");  
	    factory=new XmlBeanFactory(r);  
	}
	
	public void testM() {
		System.out.println("==============start normal===============");
		A a = factory.getBean("obj",A.class);
		a.m();
		a.n();
		
		System.out.println("==============start proxy A===============");
		A proxy = factory.getBean("proxy", A.class);
		proxy.m();
		proxy.n();
	}
	
	
	public void testAround() {
		System.out.println("===========start test Around=============");
		A proxy = factory.getBean("proxyAround", A.class);
		proxy.m();
		proxy.n();
	}
	
	
	public void testThrowsAdvisor() {
		System.out.println("===========start throws Advisor=============");
		Validator proxy = factory.getBean("throwAdvisor", Validator.class);
		try {
			proxy.validate(10);
		} catch (Exception e) {
			System.out.println("===出现了异常====");
			e.printStackTrace();
		}
	}

}
