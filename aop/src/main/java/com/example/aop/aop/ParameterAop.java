// Aop 관리하기 위해 (여러개의 api endpoint 설정할때 좋다)
package com.example.aop.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect // 클래스가 aop로 동작하기 위해 사용 
@Component //스프링에서 관리 하기 위해 필요 
public class ParameterAop {
		
	
	// Aop 범위 설정 
	@Pointcut("execution (* com.example.aop.controller..*.*(..))")
	private void cut() {}
	
	// 메소드가 실행되기 전 넘어가는 Argument 확인 
	@Before("cut()")
	public void before(JoinPoint joinPoint) {
		// 메소드 이름 출력 
		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println(method.getName());
		
		Object[] args = joinPoint.getArgs();
		for(Object obj : args) {
			System.out.println("type : " + obj.getClass().getSimpleName());
			System.out.println("value : " + obj);
		}
	}
	
	// return이 됬을때 반환값 확인 
	@AfterReturning(value = "cut()", returning = "returnObj")
	public void afterReturn(JoinPoint joinPoint, Object returnObj) {
		System.out.println("return obj");
		System.out.println(returnObj);
	}
}
