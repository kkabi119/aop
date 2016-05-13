package spring.aop.pojo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;

//POJO ��� Advice
public class LoggingAspect {
	private Log log=LogFactory.getLog(getClass());
	
	//�޼ҵ� ȣ�� ��
	public String beforeLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		
		log.trace("calling:" + method);
		System.out.println("�޼ҵ� ȣ����: "+method);
		
		return method;
	}
	
	//�޼ҵ� ȣ�� ��
	public void returningLogging(JoinPoint joinPoint, Object ret){
		String method=joinPoint.getSignature().getName();
		log.trace("called seccessfully:" + method);
		
		System.out.println("�޼ҵ� ȣ����: "+ method+", ���ϰ� : "+ret);
	}
	
	//���ܰ� �߻��� ���
	public void throwingLogging(JoinPoint joinPoint, Throwable ex){
		String method=joinPoint.getSignature().getName();
		log.trace("exception :" + method);
		
		System.out.println("���ܹ߻�: "+ method);
	}
	
	//���� �߻� ���ο� ������� ����
	public void afterLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		log.trace("finish :" + method);
		
		System.out.println("finish: "+ method);
	}
}
