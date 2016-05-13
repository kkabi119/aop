package spring.aop.anno2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(public * spring.aop.anno2.core.*.*(..))")
	private void profileTarget(){
		//���� �޼ҵ�. private void �� ����� body �� �������
	}
	
	@Around("profileTarget()")
	public Object trace(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("�޼ҵ� ���� ��...");
		
		Object ob=pjp.proceed();//�޼ҵ� ���� 
		
		System.out.println("�޼ҵ� ���� ��...");
		
		return ob;
	}
}
