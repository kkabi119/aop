package spring.aop.anno1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	private Log log=LogFactory.getLog(getClass());
	
	//메소드 호출 전
	@Before("execution(public * spring.aop.anno1.core.*.*(..))")
	public String beforeLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		
		log.trace("calling:" + method);
		System.out.println("메소드 호출전: "+method);
		
		return method;
	}
	
	//예외없이 실행 후
	@AfterReturning(pointcut="execution(public * spring.aop.anno1.core.*.*(..))" ,returning="ret")
	public void returningLogging(JoinPoint joinPoint, Object ret){
		String method=joinPoint.getSignature().getName();
		log.trace("called seccessfully:" + method);
		
		System.out.println("메소드 호출후: "+ method+", 리턴값 : "+ret);
	}
	
	//예외가 발생할 경우
	@AfterThrowing(pointcut="execution(public * spring.aop.anno1.core.*.*(..))", throwing="ex")
	public void throwingLogging(JoinPoint joinPoint, Throwable ex){
		String method=joinPoint.getSignature().getName();
		log.trace("exception :" + method);
		
		System.out.println("예외발생: "+ method);
	}
	
	//예외 발생 여부와 관계없이 실행
	@After("execution(public * spring.aop.anno1.core.*.*(..))")
	public void afterLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		log.trace("finish :" + method);
		
		System.out.println("finish: "+ method);
	}
}
