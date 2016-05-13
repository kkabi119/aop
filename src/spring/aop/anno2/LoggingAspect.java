package spring.aop.anno2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(public * spring.aop.anno2.core.*.*(..))")
	private void profileTarget(){
		//가명 메소드. private void 로 만들고 body 가 없어야함
	}
	
	@Around("profileTarget()")
	public Object trace(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("메소드 실행 전...");
		
		Object ob=pjp.proceed();//메소드 실행 
		
		System.out.println("메소드 실행 후...");
		
		return ob;
	}
}
