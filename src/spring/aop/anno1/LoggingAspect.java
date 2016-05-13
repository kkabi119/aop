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
	
	//�޼ҵ� ȣ�� ��
	@Before("execution(public * spring.aop.anno1.core.*.*(..))")
	public String beforeLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		
		log.trace("calling:" + method);
		System.out.println("�޼ҵ� ȣ����: "+method);
		
		return method;
	}
	
	//���ܾ��� ���� ��
	@AfterReturning(pointcut="execution(public * spring.aop.anno1.core.*.*(..))" ,returning="ret")
	public void returningLogging(JoinPoint joinPoint, Object ret){
		String method=joinPoint.getSignature().getName();
		log.trace("called seccessfully:" + method);
		
		System.out.println("�޼ҵ� ȣ����: "+ method+", ���ϰ� : "+ret);
	}
	
	//���ܰ� �߻��� ���
	@AfterThrowing(pointcut="execution(public * spring.aop.anno1.core.*.*(..))", throwing="ex")
	public void throwingLogging(JoinPoint joinPoint, Throwable ex){
		String method=joinPoint.getSignature().getName();
		log.trace("exception :" + method);
		
		System.out.println("���ܹ߻�: "+ method);
	}
	
	//���� �߻� ���ο� ������� ����
	@After("execution(public * spring.aop.anno1.core.*.*(..))")
	public void afterLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		log.trace("finish :" + method);
		
		System.out.println("finish: "+ method);
	}
}
