package spring.aop.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

// 메소드 실행후에 실행할 공통사항(예외가 발생하지 않은 경우만 실행)
public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		String s = method.toString()+"메소드, "+target+"에서 호출 후";
		s+=",인자수  : "+args.length+",리턴값 : "+returnValue;
		System.out.println(s);
		
	}
	
}
