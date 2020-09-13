package org.springAop.aspectj;

import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	private Set<String> cacheSet = null;

	/*
	 * 定义切点：msg1方法做切点
	 */
	@Pointcut("execution(* *..Operation.msg1(..))")
	public void k() {
	}

	/*
	 * 对msg1方法的返回做缓存，在调用直接返回该对象
	 */
	@Around("k()")
	public Set<String> beforeAdvice(ProceedingJoinPoint pjp) throws Throwable {
		if(cacheSet == null || cacheSet.isEmpty()) {
			cacheSet = (Set<String>) pjp.proceed();
		}
		
		return cacheSet;
	}

}
