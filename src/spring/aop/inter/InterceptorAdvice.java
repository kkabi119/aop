package spring.aop.inter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 메소드 실행 전과 후, 또는 예외 발생 시점에 실행 할 공통사항
public class InterceptorAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invo) throws Throwable {
		// 메소드 호출 전
		System.out.println(invo.getMethod().getName()+"메소드 호출 전...");
		
		// 대상 메소드 호출
		Object returnValue = invo.proceed();
		
		//대상 메소드 호출 후
		System.out.println(invo.getMethod().getName()+"메소드 호출 후, 리턴값:"+returnValue);
		
		return returnValue;
	}
	
}
