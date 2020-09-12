package com.rao;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice{

	public void afterThrowing(Exception ex){
        System.out.println("抛出异常之后。。");
        ex.printStackTrace();
    }
}
