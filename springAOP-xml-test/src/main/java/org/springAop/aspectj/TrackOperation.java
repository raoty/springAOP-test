package org.springAop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {

	/*
	 * 在切点之前执行切面
	 */
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("发生在切点之前。。。");
		/* System.out.println("Method Signature: " + jp.getSignature()); */
	}

	/*
	 * 在切点之后执行切面
	 */
	public void afterAdvice(JoinPoint jp) {
		System.out.println("发生在切点之后。。。");
		/* System.out.println("Method Signature: " + jp.getSignature()); */
	}

	/*
	 * 在结果返回之后执行切面
	 */
	public void afterReturnAdvice(JoinPoint jp, Object result) {
		System.out.println("发生在获取返回值之后。。。");
		System.out.println("返回值是：" + result);
		/* System.out.println("Method Signature: " + jp.getSignature()); */
	}

	/*
	 * 在执行方法前后执行切面
	 */
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around，发生在切点之前");
		Object obj = pjp.proceed();
		System.out.println("Around，发生在切点之后");
		return obj;
	}
	
	/*
	 * 在出现异常之后
	 */
	public void afterThrowing(JoinPoint pjp,Throwable error) throws Throwable {
		System.out.println("抛出了异常：");
		error.printStackTrace();
	}
	
}
