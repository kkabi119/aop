package spring.aop.pojo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;

//POJO 기반 Advice
public class LoggingAspect {
	private Log log=LogFactory.getLog(getClass());
	
	//메소드 호출 전
	public String beforeLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		
		log.trace("calling:" + method);
		System.out.println("메소드 호출전: "+method);
		
		return method;
	}
	
	//메소드 호출 후
	public void returningLogging(JoinPoint joinPoint, Object ret){
		String method=joinPoint.getSignature().getName();
		log.trace("called seccessfully:" + method);
		
		System.out.println("메소드 호출후: "+ method+", 리턴값 : "+ret);
	}
	
	//예외가 발생할 경우
	public void throwingLogging(JoinPoint joinPoint, Throwable ex){
		String method=joinPoint.getSignature().getName();
		log.trace("exception :" + method);
		
		System.out.println("예외발생: "+ method);
	}
	
	//예외 발생 여부와 관계없이 실행
	public void afterLogging(JoinPoint joinPoint) {
		String method=joinPoint.getSignature().getName();
		log.trace("finish :" + method);
		
		System.out.println("finish: "+ method);
	}
}
